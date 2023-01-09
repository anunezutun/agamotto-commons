package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.MonedaEnumerator;
import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts", schema = "public", catalog = "crecemasdb")
public class EmpresaHost {
    @Id
    @Column(name = "eho_ruc")
    private String ehoRuc;

    @Column(name = "eho_razon_social")
    private String ehoRazonSocial;

    @Column(name = "eho_nombre_fantasia")
    private String ehoNombreFantasia;

    @Column(name = "eho_direccion")
    private String ehoDireccion;

    @Column(name = "eho_distrito")
    private String ehoDistrito;

    @Column(name = "eho_provincia")
    private String ehoProvincia;

    @Column(name = "eho_departamento")
    private String ehoDepartamento;

    @Column(name = "eho_fecha_solicitud")
    private Date ehoFechaSolicitud;

    @Column(name = "eho_fecha_activacion")
    private Date ehoFechaActivacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eho_rub_codigo", referencedColumnName = "rub_codigo", nullable = false)
    private Rubros rubros;

    @Column(name = "eho_clatitud")
    private BigDecimal ehoClatitud;

    @Column(name = "eho_clongitud")
    private BigDecimal ehoClongitud;

    @Column(name = "eho_emisor_electronico")
    private Boolean ehoEmisorElectronico;

    @Column(name = "eho_vigente")
    private Boolean ehoVigente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eho_tem_codigo", referencedColumnName = "tem_codigo", nullable = false)
    private TipoEmpresa tipoEmpresa;

    @Column(name = "eho_imagen")
    private String ehoImagen;

    @Column(name = "eho_mon_codigo")
    private MonedaEnumerator moneda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eho_ubi_codigo", referencedColumnName = "ubi_codigo", nullable = false)
    private Ubigeo ubigeo;

    @Column(name = "eho_imagen_productos_chatbot")
    private String ehoImagenProductosChatbot;

    @Column(name = "eho_costo_delivery")
    private BigDecimal ehoCostoDelivery;

    @Column(name = "eho_distancia_delivery")
    private Long ehoDistanciaDelivery;

    @Column(name = "eho_codigo_producto")
    private String ehoCodigoProducto;

    @Column(name = "eho_erp_id")
    private BigInteger ehoErpCode;

    @Column(name = "eho_tdo_codigo")
    private TipoDocumentoEnumerator ehoTdoCodigo;

    @Column(name = "eho_fecha_alta")
    private Date ehoFechaAlta;

    @Column(name = "eho_fecha_empadronamiento")
    private Date ehoFechaEmpadronamiento;

    @Column(name = "eho_ola")
    private Integer ehoOla;

    @Column(name = "eho_segmento")
    private String ehoSegmento;

    @Column(name = "eho_cliente_perfecto")
    private Boolean ehoClientePerfecto;

    @Column(name = "eho_estado")
    private Integer ehoEstado;

    @Column(name = "eho_guid")
    private String ehoGuid;

    @Column(name = "eho_cliente_nuevo")
    private boolean ehoClienteNuevo;

    @Column(name = "eho_updated")
    private Boolean updated;

    @Column(name = "eho_local_annex_code")
    private String localAnnexCode;
    
    @Column(name = "eho_invoice_ruc")
    private String invoiceRuc;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empresaHost")
    private List<EmpresaHostsLocations> locations;

    @Column(name = "eho_catalog_segment")
    private Integer catalogSegment;
    
    @PrePersist
    public void onPrePersist() {
        setUpdated(Boolean.FALSE);
    }

}
