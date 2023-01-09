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
@Table(name = "maestro_productos_almacen", schema = "public", catalog = "crecemasdb")
public class MaestroProductoAlmacen {
    @Id
    @Column(name = "mpa_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String mpaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mpa_mpr_cod_crecemas", referencedColumnName = "mpr_cod_crecemas", nullable = false)
    private MaestroProducto maestroProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mpa_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

    @Column(name = "mpa_factor_conversion")
    private BigDecimal mpaFactorConversion;
}
