package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.MonedaEnumerator;
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
@Table(name = "productos_almacen", schema = "public", catalog = "crecemasdb")
public class EProductosAlmacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pal_id")
    private Long palId;

    @Column(name = "pal_codigo", unique = true)
    private String palCodigo;

    @Column(name = "pal_nombre")
    private String palNombre;

    @Column(name = "pal_customizado")
    private boolean palCustomizado;

    @Column(name = "pal_activo")
    private boolean palActivo;

    @Column(name = "pal_marca")
    private String palMarca;

    @Column(name = "pal_medida_venta")
    private BigDecimal palMedida;

    @Column(name = "pal_cantidad_disponible")
    private BigDecimal palCantidadDisponible;

    @Column(name = "pal_precio_lista")
    private BigDecimal palPrecioLista;

    @Column(name = "pal_precio_minimo")
    private BigDecimal palPrecioMinimo;

    @Column(name = "pal_umbral_reposicion")
    private BigDecimal palUmbralReposicion;

    @Column(name = "pal_imagen")
    private String palImagen;

    @Column(name = "pal_mon_codigo")
    private MonedaEnumerator moneda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pal_eho_ruc", referencedColumnName = "eho_ruc", nullable = false, unique = true)
    private EmpresaHost empresaHost;

    @Column(name = "pal_ume_codigo_venta")
    private UnidadMedidaEnumerador unidadMedida;

    @Column(name = "pal_cantidad_maxima_venta")
    private BigDecimal palCantidadMaximaVenta;

    @Column(name = "pal_presentacion")
    private String palPresentacion;

    @Column(name = "pal_codigo_sunat")
    private Long palCodigoSunat;

    @Column(name = "pal_costo_contable")
    private BigDecimal palCostoContable;

    @Column(name = "pal_cantidad_reservada")
    private BigDecimal palCantidadReservada;

    @Column(name = "pal_descripcion")
    private String palDescripcion;

    @Column(name = " pal_ume_codigo_inventario")
    private String palUmeCodigoInventario;

    @Column(name = "pal_ventas_parciales")
    private Boolean palVentasParciales;

    @Column(name = "pal_medida_inventario")
    private BigDecimal palMedidaInventario;

    @Column(name = "pal_usu_id")
    private Long palUsuId;

    @Column(name = " pal_codigo_ean")
    private String palCodigoEan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pal_cod_categoria", referencedColumnName = "cat_id", nullable = false, unique = true)
    private Categoria categoria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pal_cod_subcategoria", referencedColumnName = "sct_id", nullable = false, unique = true)
    private Subcategoria subcategoria;

    @Column(name = "pal_type")
    private int palType = 0;
    
    @Column(name = "pal_valores_octogonos")
    private String valoresOctogonos;
}
