package com.dh.Xplorando.service.impl;

import com.dh.Xplorando.dto.entrada.CategoriaEntradaDto;
import com.dh.Xplorando.dto.salida.CategoriaSalidaDto;
import com.dh.Xplorando.dto.salida.producto.ProductoSalidaDto;
import com.dh.Xplorando.entity.Categoria;
import com.dh.Xplorando.entity.Producto;
import com.dh.Xplorando.exceptions.ResourceNotFoundException;
import com.dh.Xplorando.repository.CategoriaRepository;
import com.dh.Xplorando.service.ICategoriaService;
import org.apache.coyote.BadRequestException;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaService implements ICategoriaService {
    private final Logger LOGGER = LoggerFactory.getLogger(CategoriaService.class);
    private final CategoriaRepository categoriaRepository;
    private final ModelMapper modelMapper;

    public CategoriaService(CategoriaRepository categoriaRepository, ModelMapper modelMapper) {
        this.categoriaRepository = categoriaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoriaSalidaDto crearCategoria(CategoriaEntradaDto categoriaEntradaDto) {
        Categoria categoriaRecibida = dtoEntradaAentidad(categoriaEntradaDto);
        Categoria categoriaRegistrada = categoriaRepository.save(categoriaRecibida);
        CategoriaSalidaDto categoriaResultado = entidadAdtoSalida(categoriaRegistrada);
        LOGGER.info("Categoria registrada: " + categoriaRegistrada);
        return categoriaResultado;
    }

    @Override
    public CategoriaSalidaDto buscarCategoriaPorId(Long id) {  Categoria categoriaBuscada = categoriaRepository.findById(id).orElse(null);
        CategoriaSalidaDto categoriaSalidaDto = null;
        if (categoriaBuscada != null) {
            categoriaSalidaDto = entidadAdtoSalida(categoriaBuscada);
            LOGGER.info("Se ha encontrado la categoria ", categoriaSalidaDto);
        } else {
            LOGGER.error("No se ha encontrado en la BDD una categoria con ese id " + id);
        }
        return categoriaSalidaDto;
    }

    //MAPEO
    public Categoria dtoEntradaAentidad(CategoriaEntradaDto categoriaEntradaDto){
        Categoria categoria = modelMapper.map(categoriaEntradaDto, Categoria.class);
        LOGGER.info("Mapeando DTO de entrada a entidad: {}", categoria);
        return categoria;
    }

    public CategoriaSalidaDto entidadAdtoSalida(Categoria categoria){
        CategoriaSalidaDto categoriaSalidaDto = modelMapper.map(categoria, CategoriaSalidaDto.class);
        LOGGER.info("Mapeando entidad a DTO de salida: {}", categoriaSalidaDto);
        return categoriaSalidaDto;
    }

}
