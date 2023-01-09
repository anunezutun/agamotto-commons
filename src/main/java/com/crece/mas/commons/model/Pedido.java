package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.MonedaEnumerator;
import com.crece.mas.commons.enumerator.TipoPagoEnumerator;
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
@Table(name = "pedidos", schema = "public", catalog = "crecemasdb")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ped_id")
    private long pedId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ped_fecha")
    private Date pedFecha;

    @Column(name = "ped_mon_codigo")
    private MonedaEnumerator moneda;

    @Column(name = "ped_monto_descuento")
    private BigDecimal pedMontoDescuento;

    @Column(name = "ped_monto_total")
    private BigDecimal pedMontoTotal;

    @Column(name = "ped_estado")
    private String pedEstado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ped_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ped_cli_id", referencedColumnName = "cli_id", nullable = false)
    private Cliente cliente;

    @Column(name = "ped_tpa_codigo")
    private TipoPagoEnumerator tipoPago;

    @Column(name = "ped_direccion")
    private String pedDireccion;

    @Column(name = "ped_clatitud")
    private BigDecimal pedClatitud;

    @Column(name = "ped_clongitud")
    private BigDecimal pedClongitud;

    @Column(name = "ped_monto_para_pago")
    private BigDecimal pedMontoParaPago;

    @Column(name = "ped_venta_relacionada")
    private Long pedVentaRelacionada;

    @Column(name = "ped_documento_electronico")
    private Boolean pedDocumentoElectronico;

    @Column(name = "ped_tco_codigo")
    private String pedTcoCodigo;

    @Column(name = "ped_distrito")
    private String pedDistrito;

    @Column(name = "ped_canal")
    private String pedCanal;

}
