package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.UnidadMedidaEnumerador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_proformas", schema = "public", catalog = "crecemasdb")
public class DetalleProforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dpr_id")
    private long dprId;

    @Column(name = "dpr_cantidad")
    private BigDecimal dprCantidad;

    @Column(name = "dpr_precio")
    private BigDecimal dprPrecio;

    @Column(name = "dpr_ume_codigo")
    private UnidadMedidaEnumerador unidadMedida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dpr_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dpr_prf_id", referencedColumnName = "prf_id", nullable = false)
    private Proforma proforma;

    @Column(name = "dpr_marca")
    private String dprMarca;

    @Column(name = "dpr_name")
    private String dprDescripcion;

    @Column(name = "dpr_presentacion")
    private String dprPresentacion;

    @Column(name = "dpr_medida")
    private BigDecimal dprMedida;

    @Column(name = "dpr_precio_total")
    private BigDecimal dprPrecioTotal;

}
