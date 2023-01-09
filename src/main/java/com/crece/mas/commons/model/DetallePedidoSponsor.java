package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.UnidadMedidaEnumerador;
import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_pedidos_sponsors", schema = "public", catalog = "crecemasdb")
public class DetallePedidoSponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dps_id")
    private long dpsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dps_spp_id", referencedColumnName = "spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @Column(name = "dps_nombre")
    private String dpsNombre;

    @Column(name = "dps_presentacion")
    private String dpsPresentacion;

    @Column(name = "dps_medida")
    private BigDecimal dpsMedida;

    @Column(name = "dps_ume_codigo")
    private UnidadMedidaEnumerador unidadMedida;


    @Column(name = "dps_cantidad_solicitada")
    private BigDecimal dpsCantidadSolicitada;

    @Column(name = "dps_cantidad_confirmada")
    private BigDecimal dpsCantidadConfirmada;


    @Column(name = "dps_precio_presentado")
    private BigDecimal dpsPrecioPresentado;

    @Column(name = "dps_precio_confirmado")
    private BigDecimal dpsPrecioConfirmado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dps_pes_id", referencedColumnName = "pes_id", nullable = false)
    private PedidoSponsor pedidoSponsor;

    @Column(name = "dps_codigo_descuento")
    private Long dpsCodigoDescuento;

    @Column(name = "dps_codigo_bonificacion")
    private Long dpsCodigoBonificacion;

    @Column(name = "dps_monto_descuento")
    private BigDecimal dpsMontoDescuento;

    @Column(name = "dps_precio_solicitado")
    private BigDecimal dpsPrecioSolicitado;

    @Column(name = "dps_total_linea")
    private BigDecimal dpsTotalLinea;

    @Column(name = "dps_monto_igv")
    private BigDecimal dpsMontoIgv;

    @Column(name = "dps_descuento_guid")
    private String dpsDescuentoGuid;

    @Column(name = "dps_porcentaje_descuento")
    private BigDecimal dpsPorcentajeDescuento;

    @Column(name = "dps_unidades_descuento")
    private Integer dpsUnidadesDescuento;

    @Column(name = "dps_monto_descuentog")
    private BigDecimal dpsMontoDescuentoG;

    @Column(name = "dps_porcentaje_descuentog")
    private BigDecimal dpsPorcentajeDescuentoG;
    
}
