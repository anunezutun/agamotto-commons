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
@Table(name = "tipo_empresas", schema = "public", catalog = "crecemasdb")
public class TipoEmpresa {
    @Id
    @Column(name = "tem_codigo")
    private String temCodigo;

    @Column(name = "tem_descripcion")
    private String temDescripcion;
}
