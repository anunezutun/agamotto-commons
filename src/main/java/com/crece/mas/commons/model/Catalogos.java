package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogos", schema = "public", catalog = "crecemasdb")
public class Catalogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private long catId;

    @Column(name = "cat_nombre")
    private String catNombre;

    @Column(name = "cat_activo")
    private Boolean catActivo;

    @Column(name = "cat_cant_prod")
    private Integer catCantProd;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cat_fecha")
    private Date catFecha;
}
