package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rubros_categorias", schema = "public", catalog = "crecemasdb")
public class RubrosCategorias {
    @Id
    @Column(name = "rca_id")
    private Long rcaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rca_rub_codigo", referencedColumnName = "rub_codigo", nullable = false)
    private Rubros rubros;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rca_cat_id", referencedColumnName = "cat_id", nullable = false)
    private Categoria categoria;

}
