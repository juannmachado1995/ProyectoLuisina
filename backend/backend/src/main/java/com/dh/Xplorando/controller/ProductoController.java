package com.dh.Xplorando.controller;

import com.dh.Xplorando.dto.entrada.ProductoEntradaDto;
import com.dh.Xplorando.dto.salida.producto.ProductoSalidaDto;
import com.dh.Xplorando.service.IProductoService;
import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/productos")
@CrossOrigin
//crossOrigin ?
public class ProductoController {
    //El controler es el responsable de manejar las solicitudes HTTP y enviar respuestas

    //es el artefacto principal de nuestros servicios REST

    private final IProductoService productoService;
    public ProductoController(IProductoService productoService){
        this.productoService = productoService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<ProductoSalidaDto> crearProducto(@RequestBody @Valid ProductoEntradaDto productoEntradaDto) throws BadRequestException {
        return new ResponseEntity<>(productoService.crearProducto(productoEntradaDto), HttpStatus.CREATED);
    }

}
