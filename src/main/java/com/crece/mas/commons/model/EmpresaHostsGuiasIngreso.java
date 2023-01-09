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
@Table(name = "empresa_hosts_guias_ingreso", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsGuiasIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehi_id")
    private long ehiId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ehi_fecha_registro")
    private Date ehiFechaRegistro;

    @Column(name = "ehi_ruc_distribuidor")
    private String ehiRucDistribuidor;

    @Column(name = "ehi_razon_social_distribuidor")
    private String ehiRazonSocialDistribuidor;

    @Column(name = "ehi_orden_compra")
    private String ehiOrdenCompra;

    @Column(name = "ehi_factura_compra")
    private String ehiFacturaCompra;

    @Column(name = "ehi_guia_despacho")
    private String ehiGuiaDespacho;

    @Column(name = "ehi_costo_compra")
    private BigDecimal ehiCostoCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehi_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehi_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @Column(name = "ehi_telefono_distribuidor")
    private String ehiTelefonoDistribuidor;
}
