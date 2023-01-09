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
@Table(name = "crecemas_entrenamiento_soluciones", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoSoluciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ceo_id")
    private long ceoId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ceo_fecha")
    private Date ceoFecha;

    @Column(name = "ceo_correcta")
    private boolean ceoCorrecta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ceo_cep_id", referencedColumnName = "cep_id", nullable = false)
    private CrecemasEntrenamientoPreguntas crecemasEntrenamientoPreguntas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ceo_cre_id", referencedColumnName = "cre_id", nullable = false)
    private CrecemasEntrenamientoRespuestas crecemasEntrenamientoRespuestas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ceo_cev_id", referencedColumnName = "cev_id", nullable = false)
    private CrecemasEntrenamientoAvances crecemasEntrenamientoAvances;
}
