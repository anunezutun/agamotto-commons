package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors", schema = "public", catalog = "crecemasdb")
public class Sponsor {
    @Id
    @Column(name = "spo_ruc")
    private String spoRuc;

    @Column(name = "spo_razon_social")
    private String spoRazonSocial;

    @Column(name = "spo_nombre_fantasia")
    private String spoNombreFantasia;

    @Column(name = "spo_direccion")
    private String spoDireccion;

    @Column(name = "spo_distrito")
    private String spoDistrito;

    @Column(name = "spo_provincia")
    private String spoProvincia;

    @Column(name = "spo_departamento")
    private String spoDepartamento;

    @Column(name = "spo_ubi_codigo")
    private String spoUbiCodigo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "spo_fecha_activacion")
    private Date spoFechaActivacion;

    @Column(name = "spo_vigente")
    private Boolean spoVigente;

    @Column(name = "spo_imagen")
    private String spoImagen;

}
