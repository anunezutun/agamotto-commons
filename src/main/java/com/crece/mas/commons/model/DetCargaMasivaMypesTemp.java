package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "det_carga_masiva_mypes_temp", schema = "public", catalog = "crecemasdb")
public class DetCargaMasivaMypesTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dcm_id")
    private long dcmId;

    @Column(name = "dcm_tdo_codigo")
    private String dcmTdoCodigo;

    @Column(name = "dcm_numero_documento")
    private String dcmNumeroDocumento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dcm_fecha_carga")
    private Date dcmFechaCarga;

    @Column(name = "dcm_estado_carga")
    private String dcmEstadoCarga;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dcm_ccm_id", referencedColumnName = "ccm_id", nullable = false)
    private CabCargaMasivaMypesTemp cabCargaMasivaMypesTemp;

    @Column(name = "dcm_ruc")
    private String dcmRuc;

    @Column(name = "dcm_razon_social")
    private String dcmRazonSocial;

    @Column(name = "dcm_nombre_fantasia")
    private String dcmNombreFantasia;

    @Column(name = "dcm_direccion")
    private String dcmDireccion;

    @Column(name = "dcm_distrito")
    private String dcmDistrito;

    @Column(name = "dcm_provincia")
    private String dcmProvincia;

    @Column(name = "dcm_departamento")
    private String dcmDepartamento;

    @Column(name = "dcm_fecha_solicitud")
    private Date dcmFechaSolicitud;

    @Column(name = "dcm_fecha_activacion")
    private Date dcmFechaActivacion;

    @Column(name = "dcm_rub_codigo")
    private String dcmRubCodigo;

    @Column(name = "dcm_clatitud")
    private BigDecimal dcmClatitud;

    @Column(name = "dcm_clongitud")
    private BigDecimal dcmClongitud;

    @Column(name = "dcm_emisor_electronico")
    private Boolean dcmEmisorElectronico;

    @Column(name = "dcm_vigente")
    private Boolean dcmVigente;

    @Column(name = "dcm_tem_codigo")
    private String dcmTemCodigo;

    @Column(name = "dcm_imagen")
    private String dcmImagen;

    @Column(name = "dcm_mon_codigo")
    private String dcmMonCodigo;

    @Column(name = "dcm_ubi_codigo")
    private String dcmUbiCodigo;

    @Column(name = "dcm_imagen_productos_chatbot")
    private String dcmImagenProductosChatbot;

    @Column(name = "dcm_costo_delivery")
    private BigDecimal dcmCostoDelivery;

    @Column(name = "dcm_distancia_delivery")
    private Long dcmDistanciaDelivery;

    @Column(name = "dcm_codigo_producto")
    private String dcmCodigoProducto;

    @Column(name = "dcm_msj")
    private String dcmMsj;

    @Column(name = "dcm_telefono")
    private String telefono;

    @Column(name = "dcm_correo")
    private String correo;

}
