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
@Table(name = "estado_ventas", schema = "public", catalog = "crecemasdb")
public class EstadoVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_id")
    private long eveId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eve_ven_id", referencedColumnName = "ven_id", nullable = false)
    private Venta venta;

    @Column(name = "eve_estado")
    private String eveEstado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "eve_fecha")
    private Date eveFecha;

    @Column(name = "eve_nota")
    private String eveNota;
}
