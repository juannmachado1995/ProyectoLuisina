package com.dh.Xplorando.dto.salida.producto;


import com.dh.Xplorando.dto.salida.CategoriaSalidaDto;
import com.dh.Xplorando.dto.salida.ImagenSalidaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductoSalidaDto {

    private Long id;

    private int codigoProducto;

    private String nombreProducto;

    private String descripcionProducto;

    private double precioProducto;

    private String direccion;

    private ImagenSalidaDto imagenSalidaDto;

    private CategoriaProductoSalidaDto categoriaProductoSalidaDto;

    @Override
    public String toString() {
        return "ProductoSalidaDto{" +
                "id=" + id +
                ", codigoProducto=" + codigoProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", descripcionProducto='" + descripcionProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", direccion='" + direccion + '\'' +
                ", imagenSalidaDto=" + imagenSalidaDto +
                ", categoriaProductoSalidaDto=" + categoriaProductoSalidaDto +
                '}';
    }
}

