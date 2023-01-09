package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_estados", schema = "public", catalog = "crecemasdb")
public class CrecemasEstados {
    @Id
    @Column(name = "cre_id")
    private long creId;

    @Column(name = "cre_modulo")
    private String creModulo;

    @Column(name = "cre_valor")
    private String creValor;

    @Column(name = "cre_orden")
    private Integer creOrden;

    @Column(name = "cre_descripcion")
    private String creDescripcion;

}
