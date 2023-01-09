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
@Table(name = "detalle_ventas", schema = "public", catalog = "crecemasdb")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dve_id")
    private long dveId;

    @Column(name = "dve_cantidad")
    private BigDecimal dveCantidad;

    @Column(name = "dve_precio")
    private BigDecimal dvePrecio;

    @Column(name = "dve_ume_codigo")
    private UnidadMedidaEnumerador unidadMedida;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dve_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dve_ven_id", referencedColumnName = "ven_id", nullable = false)
    private Venta venta;

    @Column(name = "dve_marca")
    private String dveMarca;

    @Column(name = "dve_name")
    private String dveDescripcion;

    @Column(name = "dve_presentacion")
    private String dvePresentacion;

    @Column(name = "dve_medida")
    private BigDecimal dveMedida;

    @Column(name = "dve_precio_total")
    private BigDecimal dvePrecioTotal;

    @Column(name = "dve_codigo_sunat")
    private Long dveCodigoSunat;
    
    @Column(name = "dve_peso")
    private BigDecimal dvePeso;
}
