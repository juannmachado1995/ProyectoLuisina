package com.dh.Xplorando.service.impl;

import com.dh.Xplorando.dto.entrada.ImagenEntradaDto;
import com.dh.Xplorando.dto.salida.ImagenSalidaDto;
import com.dh.Xplorando.entity.Imagen;
import com.dh.Xplorando.exceptions.ResourceNotFoundException;
import com.dh.Xplorando.repository.ImagenRepository;
import com.dh.Xplorando.service.IImagenService;
import org.apache.coyote.BadRequestException;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImagenService implements IImagenService {

    private final Logger LOGGER = LoggerFactory.getLogger(ImagenService.class);

    private final ImagenRepository imagenRepository;

    private final ModelMapper modelMapper;

    public ImagenService(ImagenRepository imagenRepository, ModelMapper modelMapper) {
        this.imagenRepository = imagenRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ImagenSalidaDto crearImagen(ImagenEntradaDto imagenEntradaDto) {
        Imagen imagenNueva = imagenEntradaAentidad(imagenEntradaDto);
        Imagen imagenCreada = imagenRepository.save(imagenNueva);
        ImagenSalidaDto imagenSalidaDto = entidadAImagenSalidaDto(imagenCreada);
        LOGGER.info("Se ha creado una imagen con éxito ", imagenSalidaDto);
        return imagenSalidaDto;
    }




    //MAPEO
    private Imagen imagenEntradaAentidad(ImagenEntradaDto imagenEntradaDto) {
        return modelMapper.map(imagenEntradaDto, Imagen.class);
    }

    private ImagenSalidaDto entidadAImagenSalidaDto(Imagen imagen) {
        return modelMapper.map(imagen, ImagenSalidaDto.class);
    }

}
