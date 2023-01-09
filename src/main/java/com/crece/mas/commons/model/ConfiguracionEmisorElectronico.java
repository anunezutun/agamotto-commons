package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "configuracion_emisor_electronico", schema = "public", catalog = "crecemasdb")
public class ConfiguracionEmisorElectronico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cee_id")
    private Long ceeId;

    @Column(name = "cee_codigo")
    private String ceeCodigo;

    @Column(name = "cee_valor")
    private String ceeValor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cee_egu_ruc", referencedColumnName = "egu_ruc", nullable = false)
    private EmpresaGuest empresaGuest;

    @Column(name = "cee_parametro1")
    private Long ceeParametro1;

}
