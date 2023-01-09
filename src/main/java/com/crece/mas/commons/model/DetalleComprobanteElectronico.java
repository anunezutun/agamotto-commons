package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_comprobantes_electronicos", schema = "public", catalog = "crecemasdb")
public class DetalleComprobanteElectronico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dce_id")
    private long dceId;

    @Column(name = "dce_codigo")
    private String dceCodigo;

    @Column(name = "dce_codigo_sunat")
    private String dceCodigoSunat;

    @Column(name = "dce_name")
    private String dceDescripcion;

    @Column(name = "dce_unidad_medida")
    private String dceUnidadMedida;

    @Column(name = "dce_cantidad")
    private BigDecimal dceCantidad;

    @Column(name = "dce_valor_unitario")
    private BigDecimal dceValorUnitario;

    @Column(name = "dce_precio_unitario")
    private BigDecimal dcePrecioUnitario;

    @Column(name = "dce_igv_monto")
    private BigDecimal dceIgvMonto;

    @Column(name = "dce_igv_tipo")
    private String dceIgvTipo;

    @Column(name = "dce_valor_item")
    private BigDecimal dceValorItem;

    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "dce_cel_id", referencedColumnName = "cel_id")
    private ComprobanteElectronico comprobanteElectronico;

}
