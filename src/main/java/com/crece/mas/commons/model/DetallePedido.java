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
@Table(name = "detalle_pedidos", schema = "public", catalog = "crecemasdb")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dpe_id")
    private long dpeId;

    @Column(name = "dpe_cantidad")
    private BigDecimal dpeCantidad;

    @Column(name = "dpe_precio")
    private BigDecimal dpePrecio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dpe_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

    @Column(name = "dpe_ume_codigo")
    private UnidadMedidaEnumerador unidadMedida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dpe_ped_id", referencedColumnName = "ped_id", nullable = false)
    private Pedido pedido;

    @Column(name = "dpe_marca")
    private String dpeMarca;

    @Column(name = "dpe_name")
    private String dpeDescripcion;

    @Column(name = "dpe_presentacion")
    private String dpePresentacion;

    @Column(name = "dpe_medida")
    private BigDecimal dpeMedida;

}
