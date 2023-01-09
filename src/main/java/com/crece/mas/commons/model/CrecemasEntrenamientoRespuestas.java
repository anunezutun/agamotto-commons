package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_entrenamiento_respuestas", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoRespuestas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cre_id")
    private long creId;

    @Column(name = "cre_valor")
    private String creValor;

    @Column(name = "cre_valido")
    private Boolean creValido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cre_cep_id", referencedColumnName = "cep_id", nullable = false)
    private CrecemasEntrenamientoPreguntas entrenamientoPreguntas;

    @Column(name = "cre_numero")
    private Long creNumero;

}
