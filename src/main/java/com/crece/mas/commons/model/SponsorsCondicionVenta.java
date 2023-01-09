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
@Table(name = "sponsors_condicion_venta", schema = "public", catalog = "crecemasdb")
public class SponsorsCondicionVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scv_id")
    private long scvId;

    @Column(name = "scv_codigo")
    private String scvCodigo;

    @Column(name = "scv_descripcion")
    private String scvDescripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scv_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

}
