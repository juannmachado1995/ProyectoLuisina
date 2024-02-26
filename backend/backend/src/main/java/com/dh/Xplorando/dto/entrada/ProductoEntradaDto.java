package com.dh.Xplorando.dto.entrada;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class ProductoEntradaDto {
    @NotNull(message = "El codigo no puede ser nulo")
    @Digits(integer = 10,fraction = 0,message = "El codigo no debe contener más de 10 digitos")
    private int codigoProducto;
    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message ="Debe completar con un nombre" )
    private String nombreProducto;

    @NotNull(message = "La descripcion no puede ser nula")
    @NotBlank(message = "Debe agregar una descripcion de lo que contiene el paquete")
    private String descripcionProducto;

    @NotNull(message = "El precio no puede ser nulo")
    private double precioProducto;

    @NotNull(message = "La direccion no puede ser nula")
    @NotBlank(message = "Debe completar con una direaccion")
    private String direccion;

    //validan en sus propias clases
    @Valid
    private ImagenEntradaDto imagenEntradaDto;
    @NotNull
    private Long categoriaId;

}