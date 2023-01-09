package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rubros {
    @Id
    @Column(name = "rub_codigo")
    private String rubCodigo;

    @Column(name = "rub_descripcion")
    private String rubDescripcion;

}
