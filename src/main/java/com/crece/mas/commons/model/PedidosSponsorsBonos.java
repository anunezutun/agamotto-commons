package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos_sponsors_bonos", schema = "public", catalog = "crecemasdb")
public class PedidosSponsorsBonos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psb_id")
    private long psbId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psb_pes_id", referencedColumnName = "pes_id", nullable = false)
    private PedidoSponsor pedidoSponsor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psb_sbo_id", referencedColumnName = "sbo_id", nullable = false)
    private SponsorsBonos sponsorsBonos;

    @Column(name = "psb_usado")
    private BigDecimal psbUsado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "psb_fecha", unique = true)
    private Date psbFecha;

}
