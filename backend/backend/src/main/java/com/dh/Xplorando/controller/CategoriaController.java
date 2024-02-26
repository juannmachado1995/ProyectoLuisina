package com.dh.Xplorando.controller;

import com.dh.Xplorando.dto.entrada.CategoriaEntradaDto;
import com.dh.Xplorando.dto.salida.CategoriaSalidaDto;
import com.dh.Xplorando.service.ICategoriaService;
import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final ICategoriaService iCategoriaService;

    public CategoriaController(ICategoriaService iCategoriaService) {
        this.iCategoriaService = iCategoriaService;
    }

    @PostMapping("/crear")
    public ResponseEntity<CategoriaSalidaDto> crearCategoria(@Valid @RequestBody CategoriaEntradaDto categoriaEntradaDto) throws BadRequestException {
        return new ResponseEntity<>(iCategoriaService.crearCategoria(categoriaEntradaDto), HttpStatus.CREATED);
    }



}