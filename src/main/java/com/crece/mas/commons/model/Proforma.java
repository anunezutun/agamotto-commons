package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.MonedaEnumerator;
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
@Table(name = "proformas", schema = "public", catalog = "crecemasdb")
public class Proforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prf_id")
    private long prfId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "prf_fecha")
    private Date prfFecha;

    @Column(name = "prf_estado")
    private String prfEstado;

    @Column(name = "prf_monto_descuento")
    private BigDecimal prfMontoDescuento;

    @Column(name = "prf_monto_total")
    private BigDecimal prfMontoTotal;

    @Column(name = "prf_mon_codigo")
    private MonedaEnumerator moneda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prf_egu_ruc", referencedColumnName = "egu_ruc", nullable = false)
    private EmpresaGuest empresaGuest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prf_cli_id", referencedColumnName = "cli_id", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prf_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @Column(name = "prf_monto_subtotal")
    private BigDecimal prfMontoSubtotal;

}
