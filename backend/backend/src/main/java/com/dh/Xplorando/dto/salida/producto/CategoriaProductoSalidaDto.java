package com.dh.Xplorando.dto.salida.producto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoriaProductoSalidaDto {
    private Long id;
    private String nombreCategoria;

    public CategoriaProductoSalidaDto() {
    }

    public CategoriaProductoSalidaDto(Long id, String nombreCategoria) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaProductoSalidaDto{" +
                "id=" + id +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                '}';
    }
}
