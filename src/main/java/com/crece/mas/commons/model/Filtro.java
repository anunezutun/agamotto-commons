package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "filtros")
public class Filtro {
    @Id
    @Column(name = "flt_cod")
    private String fltCod;

    @Column(name = "flt_descripcion")
    private String fltDescripcion;

    @Column(name = "flt_tipo")
    private String fltrTipo;
}
