package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_empresa_hosts", schema = "public", catalog = "crecemasdb")
public class SponsorsEmpresaHosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seh_id")
    private long sehId;

    @Column(name = "seh_vigente")
    private boolean sehVigente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seh_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seh_eho_ruc", referencedColumnName = "eho_ruc")
    private EmpresaHost empresaHost;

    @Column(name = "seh_favorito")
    private boolean sehFavorito;

    @Column(name = "seh_sht_id")
    private long sehShtId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "seh_fecha")
    private Date sehFecha;

    @Column(name = "seh_cantidad_pedidos")
    private long sehCantidadPedidos;

    @Column(name = "seh_calificacion")
    private long sehCalificacion;
}
