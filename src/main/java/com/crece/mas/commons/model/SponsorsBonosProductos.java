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
@Table(name = "sponsors_bonos_productos", schema = "public", catalog = "crecemasdb")
public class SponsorsBonosProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbp_id")
    private long sbpId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbp_spp_id", referencedColumnName = "spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @Column(name = "sbp_unidades")
    private BigDecimal sbpUnidades;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbp_sbo_id", referencedColumnName = "sbo_id", nullable = false)
    private SponsorsBonos sponsorsBonos;

}
