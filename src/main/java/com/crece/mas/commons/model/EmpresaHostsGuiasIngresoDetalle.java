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
@Table(name = "empresa_hosts_guias_ingreso_detalle", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsGuiasIngresoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hid_id")
    private long hidId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hid_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

    @Column(name = "hid_ume_codigo_compra")
    private String hidUmeCodigoCompra;

    @Column(name = "hid_medida_compra")
    private BigDecimal hidMedidaCompra;

    @Column(name = "hid_cantidad_compra")
    private BigDecimal hidCantidadCompra;

    @Column(name = "hid_ume_codigo_ingreso")
    private String hidUmeCodigoIngreso;

    @Column(name = "hid_cantidad_ingreso")
    private BigDecimal hidCantidadIngreso;

    @Column(name = "hid_factor_conversion")
    private BigDecimal hidFactorConversion;

    @Column(name = "hid_medida_ingreso")
    private BigDecimal hidMedidaIngreso;

    @Column(name = "hid_costo_compra")
    private BigDecimal hidCostoCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hid_ehi_id", referencedColumnName = "ehi_id", nullable = false)
    private EmpresaHostsGuiasIngreso empresaHostsGuiasIngreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hid_spp_id", referencedColumnName = "spp_id")
    private SponsorProducto sponsorProducto;
}
