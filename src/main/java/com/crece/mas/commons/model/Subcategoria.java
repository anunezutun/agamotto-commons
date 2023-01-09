package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subcategorias", schema = "public", catalog = "crecemasdb")
public class Subcategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sct_id")
    private long sctId;

    @Column(name = "sct_cod_categoria")
    private long sctCodCategoria;

    @Column(name = "sct_codigo")
    private String sctCodigo;

    @Column(name = "sct_nombre")
    private String sctNombre;

    @Column(name = "sct_descripcion")
    private String sctDescripcion;

    @Column(name = "sct_imagen")
    private String sctImagen;

    @Column(name = "sct_font_icon")
    private String sctFontIcon;

    @Column(name = "sct_font_color")
    private String sctFontColor;

    public Subcategoria(long sctId) {
    	this.sctId = sctId;
    }
}
