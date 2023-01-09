package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmpresaHostsFiltros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehf_id")
    private long ehfId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehf_flt_cod", referencedColumnName = "flt_cod", nullable = false)
    private Filtro filtro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehf_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

}
