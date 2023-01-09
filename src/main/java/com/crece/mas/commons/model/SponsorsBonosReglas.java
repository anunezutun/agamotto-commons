/*
package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_bonos_reglas", schema = "public", catalog = "crecemasdb")
public class SponsorsBonosReglas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbp_id")
    private long sbpId;

    @Column(name = "sbp_tipo")
    private Long sbpTipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spp_id", referencedColumnName = "sbp_spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @Column(name = "sbp_unidades")
    private BigDecimal sbpUnidades;

    @Column(name = "sbp_condicion")
    private String sbpCondicion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbo_id", referencedColumnName = "sbp_sbo_id", nullable = false)
    private SponsorsBonos sponsorsBonos;

}
*/
