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
@Table(name = "sponsors_rangos", schema = "public", catalog = "crecemasdb")
public class SponsorsRangos {
    @Id
    @Column(name = "spr_id")
    private long sprId;

    @Column(name = "spr_tipo")
    private String sprTipo;

    @Column(name = "spr_nombre")
    private String sprNombre;

    @Column(name = "spr_presentacion")
    private String sprPresentacion;

    @Column(name = "spr_valor_inicial")
    private BigDecimal sprValorInicial;

    @Column(name = "spr_valor_final")
    private BigDecimal sprValorFinal;

    @Column(name = "spr_orden")
    private Integer sprOrden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spr_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

}
