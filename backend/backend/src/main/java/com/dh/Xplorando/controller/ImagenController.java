package com.dh.Xplorando.controller;

import com.dh.Xplorando.dto.entrada.ImagenEntradaDto;
import com.dh.Xplorando.dto.salida.ImagenSalidaDto;
import com.dh.Xplorando.service.IImagenService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imagenes")
@CrossOrigin
public class ImagenController {
    private final IImagenService imagenService;

    public ImagenController(IImagenService imagenService) {
        this.imagenService = imagenService;
    }


    @PostMapping("/crear")
    public ResponseEntity<ImagenSalidaDto> crearImagen(@RequestBody @Valid ImagenEntradaDto imagenEntradaDto) {
        return new ResponseEntity<>(imagenService.crearImagen(imagenEntradaDto), HttpStatus.CREATED);
    }


}


