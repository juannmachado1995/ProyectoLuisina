package com.dh.Xplorando.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="PRODUCTOS", uniqueConstraints = {@UniqueConstraint(columnNames = "CODIGO")})
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="CODIGO")
    private int codigoProducto;
    @Column(name="NOMBRE")
    private String nombreProducto;
    @Column(name="DESCRIPCION")
    private String descripcionProducto;
    @Column(name="PRECIO")
    private double precioProducto;
    @Column(name="DIRECCION")
    private String direccion;

    @OneToMany(mappedBy ="producto", fetch = FetchType.LAZY)
    private Set<Imagen> imagenes = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
