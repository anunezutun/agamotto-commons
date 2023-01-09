package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_bonos", schema = "public", catalog = "crecemasdb")
public class SponsorsBonos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbo_id")
    private long sboId;

    @Column(name = "sbo_codigo")
    private Long sboCodigo;

    @Column(name = "sbo_nombre")
    private String sboNombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbo_spo_ruc", referencedColumnName = "spo_ruc", nullable = false)
    private Sponsor sponsor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbo_fab_ruc", referencedColumnName = "fab_ruc", nullable = false)
    private Fabricante fabricante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sbo_sht_id", referencedColumnName = "sht_id", nullable = false)
    private SponsorsEmpresaHostsTipos sponsorsEmpresaHostsTipos;

    @Column(name = "sbo_ubi_departamento")
    private String sboUbiDepartamento;

    @Column(name = "sbo_ubi_provincia")
    private String sboUbiProvincia;

    @Column(name = "sbo_ubi_distrito")
    private String sboUbiDistrito;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sbo_fecha_inicio")
    private Date sboFechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sbo_fecha_fin")
    private Date sboFechaFin;

    @Column(name = "sbo_notificacion")
    private Boolean sboNotificacion;

    @Column(name = "sbo_promo_exclusiva")
    private Boolean sboPromoExclusiva;

    @Column(name = "sbo_unidades_bono")
    private BigDecimal sboUnidadesBono;

    @Column(name = "sbo_estado")
    private String sboEstado;

    @Column(name = "sbo_activo")
    private Boolean sboActivo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sbo_fecha_creacion")
    private Date sboFechaCreacion;

    @Column(name = "sbo_calificacion")
    private Integer sboCalificacion;

    @Column(name = "sbo_imagen")
    private String sboImagen;

    @Column(name = "sbo_descripcion")
    private String sboDescripcion;

}
