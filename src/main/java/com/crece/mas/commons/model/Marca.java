package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "marcas", schema = "public", catalog = "crecemasdb")
public class Marca {
    @Id
    @Column(name = "mar_codigo")
    private String marCodigo;

    @Column(name = "mar_nombre")
    private String marNombre;

    @Column(name = "mar_descripcion")
    private String marDescripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mar_fab_ruc", referencedColumnName = "fab_ruc")
    private Fabricante fabricante;

}
