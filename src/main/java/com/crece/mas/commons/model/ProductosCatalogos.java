package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos_catalogos", schema = "public", catalog = "crecemasdb")
public class ProductosCatalogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pca_id")
    private long pcaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pca_cat_id", referencedColumnName = "cat_id", nullable = false)
    private Catalogos catalogos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pca_mpr_cod_crecemas", referencedColumnName = "mpr_cod_crecemas", nullable = false)
    private MaestroProducto maestroProducto;
}
