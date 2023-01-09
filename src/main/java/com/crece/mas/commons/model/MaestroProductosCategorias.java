package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "maestro_productos_categorias", schema = "public", catalog = "crecemasdb")
public class MaestroProductosCategorias {
    @Id
    @Column(name = "mpc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mpcId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mpc_cat_id", referencedColumnName = "cat_id", nullable = false)
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mpc_mpr_cod_crecemas", referencedColumnName = "mpr_cod_crecemas", nullable = false)
    private MaestroProducto maestroProducto;

}