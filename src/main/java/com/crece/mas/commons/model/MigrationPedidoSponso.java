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
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos_sponsors", schema = "public", catalog = "crecemasdb")
public class MigrationPedidoSponso {
    @Id
    @Column(name = "pes_id")
    private long pesId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pes_fecha_registro")
    private Date pesFechaRegistro;

    @Column(name = "pes_mon_codigo")
    private MonedaEnumerator moneda;

    @Column(name = "pes_precio_compra_solicitado")
    private BigDecimal pesPrecioCompraSolicitado;

    @Column(name = "pes_estado")
    private String pesEstado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pes_usu_id", referencedColumnName = "usu_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pes_eho_ruc", referencedColumnName = "eho_ruc")
    private EmpresaHost empresaHost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pes_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

    @Column(name = "pes_precio_compra_confirmado")
    private BigDecimal pesPrecioCompraConfirmado;

    @Column(name = "pes_monto_descuento")
    private BigDecimal pesMontoDescuento;

    @Column(name = "pes_monto_subtotal")
    private BigDecimal pesMontoSubtotal;

    @Column(name = "pes_monto_igv")
    private BigDecimal pesMontoIgv;

    @Column(name = "pes_igv")
    private BigDecimal pesIgv;

    @Column(name = "pes_tpa_codigo")
    private TipoPagoEnumerator tipoPago;

    @Column(name = "pes_guid")
    private String pesGuid;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidoSponsor")
    private List<DetallePedidoSponsor> detalles;
}