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
@Table(name = "sponsors_avisos", schema = "public", catalog = "crecemasdb")
public class SponsorsAvisos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sav_id")
    private long savId;

    @Column(name = "sav_nombre")
    private String savNombre;

    @Column(name = "sav_descripcion")
    private String savDescripcion;

    @Column(name = "sav_publico_objetivo")
    private String savPublicoObjetivo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sav_fecha_creacion")
    private Date savFechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sav_fecha_inicio")
    private Date savFechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sav_fecha_fin")
    private Date savFechaFin;

    @Column(name = "sav_estado")
    private String savEstado;

    @Column(name = "sav_imagen")
    private String savImagen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sav_spo_ruc", referencedColumnName = "spo_ruc", nullable = false)
    private Sponsor sponsor;
}
