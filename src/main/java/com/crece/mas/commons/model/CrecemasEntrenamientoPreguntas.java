package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_entrenamiento_preguntas", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoPreguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cep_id")
    private long cepId;

    @Column(name = "cep_numero")
    private Long cepNumero;

    @Column(name = "cep_pregunta")
    private String cepPregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cep_cen_id", referencedColumnName = "cen_id", nullable = false)
    private CrecemasEntrenamientoNiveles entrenamientoNiveles;

    @Column(name = "cep_cantidad_respuestas")
    private Long cepCantidadRespuestas;

}
