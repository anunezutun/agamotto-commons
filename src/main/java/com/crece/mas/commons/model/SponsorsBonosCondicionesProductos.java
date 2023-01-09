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
@Table(name = "sponsors_bonos_condiciones_productos", schema = "public", catalog = "crecemasdb")
public class SponsorsBonosCondicionesProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbc_id")
    private long sbcId;

    @Column(name = "sbc_unidades")
    private BigDecimal sbcUnidades;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbc_spp_id", referencedColumnName = "spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbc_sbo_id", referencedColumnName = "sbo_id", nullable = false)
    private SponsorsBonos sponsorsBonos;
}
