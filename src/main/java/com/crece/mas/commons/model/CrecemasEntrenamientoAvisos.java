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
@Table(name = "crecemas_entrenamiento_avisos", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoAvisos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cea_id")
    private long ceaId;

    @Column(name = "cea_numero")
    private Long ceaNumero;

    @Column(name = "cea_nombre")
    private String ceaNombre;

    @Column(name = "cea_subtitulo")
    private String ceaSubtitulo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cea_fecha_registro")
    private Date ceaFechaRegistro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cea_fecha_inicio")
    private Date ceaFechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cea_fecha_fin")
    private Date ceaFechaFin;

    @Column(name = "cea_activo")
    private Boolean ceaActivo;

    @Column(name = "cea_imagen")
    private String ceaImagen;

    @Column(name = "cea_link")
    private String ceaLink;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cea_cet_id", referencedColumnName = "cet_id", nullable = false)
    private CrecemasEntrenamiento entrenamiento;

}
