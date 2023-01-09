package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "sponsors_descuentos", schema = "public", catalog = "crecemasdb")
public class SponsorsDescuentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sde_id")
    private long sdeId;

    @Column(name = "sde_codigo")
    private String sdeCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_fab_ruc", referencedColumnName = "fab_ruc")
    private Fabricante fabricante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_mar_codigo", referencedColumnName = "mar_codigo")
    private Marca marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_scv_id", referencedColumnName = "scv_id")
    private SponsorsCondicionVenta sponsorsCondicionVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_sht_id", referencedColumnName = "sht_id")
    private SponsorsEmpresaHostsTipos sponsorsEmpresaHostsTipos;

    @Column(name = "sde_ubi_departamento")
    private String sdeUbiDepartamento;

    @Column(name = "sde_ubi_provincia")
    private String sdeUbiProvincia;

    @Column(name = "sde_ubi_distrito")
    private String sdeUbiDistrito;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sde_fecha_inicio")
    private Date sdeFechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sde_fecha_fin")
    private Date sdeFechaFin;

    @Column(name = "sde_notificacion")
    private Boolean sdeNotificacion;

    @Column(name = "sde_promo_exclusiva")
    private Boolean sdePromoExclusiva;

    @Column(name = "sde_activo")
    private Boolean sdeActivo;

    @Column(name = "sde_descripcion")
    private String sdeDescripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sde_fecha_creacion")
    private Date sdeFechaCreacion;

    @Column(name = "sde_nombre")
    private String sdeNombre;

    @Column(name = "sde_estado")
    private String sdeEstado;

    @Column(name = "sde_calificacion")
    private Long sdeCalificacion;

    @Column(name = "sde_monto_descuento")
    private BigDecimal sdeMontoDescuento;

    @Column(name = "sde_porcentaje_descuento")
    private BigDecimal sdePorcentajeDescuento;

    @Column(name = "sde_tope_descuento")
    private BigDecimal sdeTopeDescuento;

    @Column(name = "sde_tope_cantidad")
    private Long sdeTopeCantidad;

    @Column(name = "sde_tope_cantidad_cliente")
    private Integer sdeTopeCantidadCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_spp_id", referencedColumnName = "spp_id")
    private SponsorProducto sponsorProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_sca_id", referencedColumnName = "sca_id")
    private SponsorCategoria sponsorCategoria;

    @Column(name = "sde_orden_compra_guid")
    private String ordenCompraGuid;

    @Column(name = "sde_aplica_primera_compra")
    private Boolean aplicaPrimeraCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_ssu_id", referencedColumnName = "ssu_id")
    private SponsorSubcategoria sponsorSubcategoria;

}
