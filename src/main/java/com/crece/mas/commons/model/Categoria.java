package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categorias", schema = "public", catalog = "crecemasdb")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private long catId;

    @Column(name = "cat_descripcion")
    private String catDescripcion;

    @Column(name = "cat_imagen")
    private String catImagen;

    @Column(name = "cat_color")
    private String catColor;

    public Categoria(long catId) {
    	this.catId = catId;
    }
}
