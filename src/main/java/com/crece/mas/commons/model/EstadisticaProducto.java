package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estadistica_productos", schema = "public", catalog = "crecemasdb")
public class EstadisticaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "epr_id")
    private long eprId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "epr_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

    @Column(name = "epr_cantidad_pedidos")
    private String eprCantidadPedidos;

    @Column(name = "epr_pal_eho_ruc")
    private String eprPalEhoRuc;
}
