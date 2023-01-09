package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "direccion_clientes", schema = "public", catalog = "crecemasdb")
public class DireccionCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dcl_id")
    private long dclId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dcl_cli_id", referencedColumnName = "cli_id", nullable = false)
    private Cliente cliente;

    @Column(name = "dcl_lugar")
    private String dclLugar;

    @Column(name = "dcl_direccion")
    private String dclDireccion;

    @Column(name = "dcl_distrito")
    private String dclDistrito;

    @Column(name = "dcl_provincia")
    private String dclProvincia;

    @Column(name = "dcl_departamento")
    private String dclDepartamento;

    @Column(name = "dcl_pais")
    private String dclPais;

    @Column(name = "dcl_clatitud")
    private BigDecimal dclClatitud;

    @Column(name = "dcl_longitud")
    private BigDecimal dclLongitud;

}
