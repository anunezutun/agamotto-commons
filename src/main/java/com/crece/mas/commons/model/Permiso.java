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
@Table(name = "permisos", schema = "public", catalog = "crecemasdb")
public class Permiso {
    @Id
    @Column(name = "per_id")
    private long perId;

    @Column(name = "per_descripcion")
    private String perDescripcion;

}
