package com.crece.mas.commons.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.crece.mas.commons.enumerator.TipoPagoEnumerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts_tipo_pagos", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsTipoPagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eht_id")
    private long ehtId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eht_eho_ruc", referencedColumnName = "eho_ruc")
    private EmpresaHost empresaHost;

    @Column(name = "eht_tpa_codigo")
    private TipoPagoEnumerator tipoPago;

    @Column(name = "eht_nombre")
    private String ehtNombre;

    @Column(name = "eht_descripcion")
    private String ehtDescripcion;

    @Column(name = "eht_appicon")
    private Boolean ehtAppIcon;

    @Column(name = "eht_crediticon")
    private Boolean ehtCreditIcon;
    
    @Column(name = "eht_type")
    @Builder.Default
    private int ehtType = 0;

}
