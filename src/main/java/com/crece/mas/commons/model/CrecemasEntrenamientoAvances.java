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
@Table(name = "crecemas_entrenamiento_avances", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoAvances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cev_id")
    private long cevId;

    @Column(name = "cev_intento")
    private Long cevIntento;

    @Column(name = "cev_estado")
    private String cevEstado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cev_fecha_inicio")
    private Date cevFechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cev_fecha_ultimo_acceso")
    private Date cevFechaUltimoAcceso;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cev_fecha_fin")
    private Date cevFechaFin;

    @Column(name = "cev_puntaje")
    private Double cevPuntaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cev_cen_id", referencedColumnName = "cen_id", nullable = false)
    private CrecemasEntrenamientoNiveles crecemasEntrenamientoNiveles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cev_ces_id", referencedColumnName = "ces_id", nullable = false)
    private CrecemasEntrenamientoSuscripciones crecemasEntrenamientoSuscripciones;
}
