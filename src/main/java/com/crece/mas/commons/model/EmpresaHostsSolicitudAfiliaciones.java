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
@Table(name = "empresa_hosts_solicitud_afiliaciones", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsSolicitudAfiliaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehs_id")
    private long ehsId;

    @Column(name = "ehs_nombre_contacto")
    private String ehsNombreContacto;

    @Column(name = "ehs_correo_contacto")
    private String ehsCorreoContacto;

    @Column(name = "ehs_telefono_contacto")
    private String ehsTelefonoContacto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ehs_fecha_solicitud")
    private Date ehsFechaSolicitud;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ehs_fecha_respuesta")
    private Date ehsFechaRespuesta;

    @Column(name = "ehs_estado")
    private String ehsEstado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehs_spo_ruc", referencedColumnName = "spo_ruc", nullable = false)
    private Sponsor sponsor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehs_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

}
