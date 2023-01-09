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
@Table(name = "cab_productos_catalogos_temp", schema = "public", catalog = "crecemasdb")
public class CabProductosCatalogosTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cct_id")
    private long cctId;

    @Column(name = "cct_usu_id")
    private long cctUsuId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cct_fecha")
    private Date cctFecha;

    @Column(name = "cct_cant_prod")
    private int cctCantProd;

    @Column(name = "cct_cat_id")
    private long cctCatId;
}
