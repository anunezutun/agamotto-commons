package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fabricantes")
public class Fabricante {
    @Id
    @Column(name = "fab_ruc")
    private String fabRuc;

    @Column(name = "fab_razon_social")
    private String fabRazonSocial;

    @Column(name = "fab_nombre_fantasia")
    private String fabNombreFantasia;

    @Column(name = "fab_direccion")
    private String fabDireccion;

    @Column(name = "fab_distrito")
    private String fabDistrito;

    @Column(name = "fab_provincia")
    private String fabProvincia;

    @Column(name = "fab_departamento")
    private String fabDepartamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fab_ubi_codigo", referencedColumnName = "ubi_codigo", nullable = false)
    private Ubigeo ubigeo;
}
