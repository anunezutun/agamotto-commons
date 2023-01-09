package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos_agrupaciones", schema = "public", catalog = "crecemasdb")
public class ProductosAgrupaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pag_id")
    private long pagId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pag_agr_id", referencedColumnName = "agr_id", nullable = false)
    private Agrupacion agrupacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pag_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

}
