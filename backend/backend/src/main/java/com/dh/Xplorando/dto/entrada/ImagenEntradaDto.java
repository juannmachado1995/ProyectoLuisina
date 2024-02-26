package com.dh.Xplorando.dto.entrada;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImagenEntradaDto {
    @NotNull(message = "La url de la imagen no puede ser nula")
    @NotBlank(message = "Debe completar con una url")
    private String urlImagen;

}
