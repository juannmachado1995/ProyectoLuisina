package com.dh.Xplorando.service;

import com.dh.Xplorando.dto.entrada.CategoriaEntradaDto;
import com.dh.Xplorando.dto.salida.CategoriaSalidaDto;
import com.dh.Xplorando.dto.salida.producto.ProductoSalidaDto;
import com.dh.Xplorando.exceptions.ResourceNotFoundException;
import org.apache.coyote.BadRequestException;

public interface ICategoriaService {

    CategoriaSalidaDto crearCategoria(CategoriaEntradaDto categoriaEntradaDto) throws BadRequestException;
    CategoriaSalidaDto buscarCategoriaPorId(Long id);
}
