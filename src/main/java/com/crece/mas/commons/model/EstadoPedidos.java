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
@Table(name = "estado_pedidos", schema = "public", catalog = "crecemasdb")
public class EstadoPedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "epe_id")
    private long epeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "epe_ped_id", referencedColumnName = "ped_id", nullable = false)
    private Pedido pedido;

    @Column(name = "epe_estado")
    private String epeEstado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "epe_fecha")
    private Date epeFecha;

    @Column(name = "epe_nota")
    private String epeNota;
}
