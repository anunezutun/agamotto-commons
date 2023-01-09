package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos_sponsors_descuentos", schema = "public", catalog = "crecemasdb")
public class PedidosSponsorsDescuentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psd_id")
    private long psdId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psd_pes_id", referencedColumnName = "pes_id")
    private PedidoSponsor pedidoSponsor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psd_sde_id", referencedColumnName = "sde_id")
    private SponsorsDescuentos sponsorsDescuentos;

    @Column(name = "psd_usado")
    private BigDecimal psdUsado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "psd_fecha")
    private Date psdFecha;

}
