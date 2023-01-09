package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estado_pedidos_sponsors", schema = "public", catalog = "crecemasdb")
public class EstadoPedidoSponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eps_id")
    private long epsId;

    @Column(name = "eps_estado")
    private String epsEstado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "eps_fecha")
    private Date epsFecha;

    @Column(name = "eps_nota")
    private String epsNota;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eps_pes_id", referencedColumnName = "pes_id")
    private PedidoSponsor pedidoSponsor;

}
