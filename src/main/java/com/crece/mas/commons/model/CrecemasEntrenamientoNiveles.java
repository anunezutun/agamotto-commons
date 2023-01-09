package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_entrenamiento_niveles", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoNiveles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cen_id")
    private long cenId;

    @Column(name = "cen_numero")
    private Long cenNumero;

    @Column(name = "cen_nombre")
    private String cenNombre;

    @Column(name = "cen_subtitulo")
    private String cenSubtitulo;

    @Column(name = "cen_porcentaje_requerido")
    private Long cenPorcentajeRequerido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cen_cem_id", referencedColumnName = "cem_id", nullable = false)
    private CrecemasEntrenamientoModulos entrenamientoModulos;

    @Column(name = "cen_cantidad_preguntas")
    private Long cenCantidadPreguntas;

}
