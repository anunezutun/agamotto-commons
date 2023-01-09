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
@Table(name = "roles", schema = "public", catalog = "crecemasdb")
public class Role {
    @Id
    @Column(name = "rol_id")
    private long rolId;

    @Column(name = "rol_descripcion", unique = true)
    private String rolDescripcion;

    @Column(name = "rol_modulo")
    private String rolModulo;
}
