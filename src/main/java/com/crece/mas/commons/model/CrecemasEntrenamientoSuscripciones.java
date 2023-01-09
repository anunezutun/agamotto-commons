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
@Table(name = "crecemas_entrenamiento_suscripciones", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoSuscripciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ces_id")
    private long cesId;

    @Column(name = "ces_estado")
    private String cesEstado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ces_fecha_inicio")
    private Date cesFechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ces_fecha_ultimo_acceso")
    private Date cesFechaUltimoAcceso;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ces_fecha_fin")
    private Date cesFechaFin;

    @Column(name = "ces_puntaje")
    private Double cesPuntaje;

    @Column(name = "ces_certificado")
    private String cesCertificado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ces_cem_id", referencedColumnName = "cem_id", nullable = false)
    private CrecemasEntrenamientoModulos crecemasEntrenamientoModulos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ces_ueh_id", referencedColumnName = "ueh_id", nullable = false)
    private UsuariosEmpresaHosts usuariosEmpresaHosts;

}
