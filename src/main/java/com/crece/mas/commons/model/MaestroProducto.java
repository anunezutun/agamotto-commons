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
@Table(name = "maestro_productos", schema = "public", catalog = "crecemasdb")
public class MaestroProducto {
    @Id
    @Column(name = "mpr_cod_crecemas")
    private String mprCodCrecemas;

    @Column(name = "mpr_codigo_sunat")
    private long mprCodSunat;

    @Column(name = "mpr_marca")
    private String mprMarca;

    @Column(name = "mpr_medida_compra")
    private BigDecimal mprMedida;

    @Column(name = "mpr_nombre")
    private String mprDescripcion;

    @Column(name = "mpr_activo")
    private boolean mprActivo;

    @Column(name = "mpr_precio_venta_sugerido")
    private BigDecimal mprPrecio;

    @Column(name = "mpr_imagen")
    private String mprImagen;

    @Column(name = "mpr_mon_codigo")
    private MonedaEnumerator moneda;

    @Column(name = "mpr_ume_codigo_compra")
    private UnidadMedidaEnumerador unidadMedida;

    @Column(name = "mpr_presentacion")
    private String mprPresentacion;

    @Column(name = "mpr_ume_codigo_venta")
    private String mprUmeCodigoVenta;

    @Column(name = "mpr_medida_venta")
    private BigDecimal mprMedidaVenta;

    @Column(name = " mpr_cod_categoria")
    private Long mprCodigoCategoria;

    @Column(name = " mpr_cod_subcategoria")
    private Long mprCodigoSubcategoria;
    
    @Column(name = " mpr_cod_ean")
    private String mprCodigoEan;
}
