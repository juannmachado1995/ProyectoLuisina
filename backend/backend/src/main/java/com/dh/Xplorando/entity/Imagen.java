package com.dh.Xplorando.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
@Table(name="IMAGENES")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="URL")
    private String urlImagen;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;

    //CascadeType.Persist
    //CascadeType.PERSIST indica que las operaciones de persistencia (guardar en la base de datos) deben propagarse automáticamente a las entidades relacionadas.Esto significa que cuando guardas una nueva imagen, también se persistirá automáticamente el producto asociado.
    ////Por ejemplo, si tienes una entidad Usuario con una relación @OneToMany a una colección de Pedidos y marcas la relación como CascadeType.PERSIST, cuando guardas un nuevo usuario que tiene nuevos pedidos, los pedidos también
    //guardarán automáticamente en la base de datos.

    //CascadeType.ALL: Indica que todas las operaciones de persistencia deben propagarse a las entidades asociadas. Esto incluye INSERT, UPDATE y DELETE.
    //CascadeType.PERSIST: Indica que solo las operaciones de persistencia de INSERT deben propagarse a las entidades asociadas.
    //CascadeType.MERGE: Indica que solo las operaciones de persistencia de UPDATE deben propagarse a las entidades asociadas.
    //CascadeType.REMOVE: Indica que solo las operaciones de persistencia de DELETE
    //  deben propagarse a las entidades asociadas.
    //CascadeType.REFRESH: Indica que las operaciones de actualización de la entidad principal deben propagarse a las entidades asociadas.

}
