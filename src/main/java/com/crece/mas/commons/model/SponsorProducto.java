package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.IGVTypeEnumerator;
import com.crece.mas.commons.enumerator.MonedaEnumerator;
import com.crece.mas.commons.enumerator.UnidadMedidaEnumerador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_productos", schema = "public", catalog = "crecemasdb")
public class SponsorProducto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spp_id")
    private long sppId;

    @Column(name = "spp_codigo")
    private String sppCodigo;

    @Column(name = "spp_codigo_sunat")
    private long sppCodigoSunat;

    @Column(name = "spp_nombre")
    private String sppNombre;

    @Column(name = "spp_presentacion")
    private String sppPresentacion;

    @Column(name = "spp_medida")
    private BigDecimal sppMedida;

    @Column(name = "spp_precio_lista")
    private BigDecimal sppPrecioLista;

    @Column(name = "spp_imagen")
    private String sppImagen;

    @Column(name = "spp_activo")
    private boolean sppActivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spp_mar_codigo", referencedColumnName = "mar_codigo", nullable = false)
    private Marca marca;

    @Column(name = "spp_mon_codigo")
    private MonedaEnumerator moneda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spp_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

    @Column(name = "spp_cantidad_stock")
    private BigDecimal sppCantidadStock;

    @Column(name = "spp_ume_codigo")
    private UnidadMedidaEnumerador unidadMedida;

    @Column(name = "spp_descripcion")
    private String sppDescripcion;

    @Column(name = "spp_codigo_ean")
    private String sppCodigoEan;

    @Column(name = "spp_octagonos")
    private Boolean sppOctagonos;

    @Column(name = "spp_cantidad_reservada")
    private BigDecimal sppCantidadReservada;
    
    @Column(name = "ssp_precio_sugerido")
    private BigDecimal sspPrecioSugerido;

    @Column(name = "spp_valores_octogonos")
    private String valoresOctogonos;

    @Column(name = "spp_purchase_unit_description")
    private String purchaseUnitDescription;

    @Column(name = "spp_guid")
    private String sppGuid;

    @Column(name = "spp_catalog_segment")
    private Integer catalogSegment;

    @Column(name = "spp_giro_day")
    private BigDecimal giroDay;

    @Column(name = "spp_giro_plan_period")
    private String giroPlanPeriod;

    @Column(name = "spp_giro_plan_value")
    private BigDecimal giroPlanValue;

    @Column(name = "spp_igv_type")
    private IGVTypeEnumerator igvType;
}
