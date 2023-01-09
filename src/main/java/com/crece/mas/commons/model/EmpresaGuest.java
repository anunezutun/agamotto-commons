package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_guests", schema = "public", catalog = "crecemasdb")
public class EmpresaGuest {
    @Id
    @Column(name = "egu_ruc")
    private String eguRuc;

    @Column(name = "egu_razon_social")
    private String eguRazonSocial;

    @Column(name = "egu_nombre_fantasia")
    private String eguNombreFantasia;

    @Column(name = "egu_direccion")
    private String eguDireccion;

    @Column(name = "egu_distrito")
    private String eguDistrito;

    @Column(name = "egu_provincia")
    private String eguProvincia;

    @Column(name = "egu_departamento")
    private String eguDepartamento;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "egu_fecha_solicitud")
    private Date eguFechaSolicitud;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "egu_fecha_activacion")
    private Date eguFechaActivacion;

    @Column(name = "egu_clatitud")
    private BigDecimal eguClatitud;

    @Column(name = "egu_clongitud")
    private BigDecimal eguClongitud;

    @Column(name = "egu_calificacion")
    private Long eguCalificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "egu_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

    @Column(name = "egu_emisor_electronico")
    private Boolean eguEmisorElectronico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "egu_ubi_codigo", referencedColumnName = "ubi_codigo", nullable = false)
    private Ubigeo ubigeo;

    @Column(name = "egu_vigente")
    private boolean eguVigente;
}
