package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ubigeo", schema = "public", catalog = "crecemasdb")
public class Ubigeo {
    @Id
    @Column(name = "ubi_codigo")
    private String ubiCodigo;

    @Column(name = "ubi_distrito")
    private String ubiDistrito;

    @Column(name = "ubi_provincia")
    private String ubiProvincia;

    @Column(name = "ubi_departamento")
    private String ubiDepartamento;

}
