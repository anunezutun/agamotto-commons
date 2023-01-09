package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_parametros", schema = "public", catalog = "crecemasdb")
public class CrecemasParametro {
    @Id
    @Column(name = "cpa_codigo")
    private String cpaCodigo;

    @Column(name = "cpa_descripcion")
    private String cpaDescripcion;

}
