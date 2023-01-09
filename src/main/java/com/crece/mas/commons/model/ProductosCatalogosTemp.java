package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos_catalogos_temp", schema = "public", catalog = "crecemasdb")
public class ProductosCatalogosTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pct_id")
    private long pctId;

    @Column(name = "pct_cat_id")
    private long pctCatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pct_mpr_cod_crecemas", referencedColumnName = "mpr_cod_crecemas", nullable = false)
    private MaestroProducto maestroProducto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pct_fecha")
    private Date pctFecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pct_cct_id", referencedColumnName = "cct_id", nullable = false)
    private CabProductosCatalogosTemp cabProductosCatalogosTemp;
}
