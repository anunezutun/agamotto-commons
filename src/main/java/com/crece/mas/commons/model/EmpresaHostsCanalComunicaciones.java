package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.CanalComunicacionesEnumerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts_canal_comunicaciones", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsCanalComunicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehc_id")
    private long ehcId;

    @Column(name = "ehc_identificador_canal")
    private String ehcIdentificadorCanal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehc_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;
    
    @Column(name = "ehc_cco_id")
    private CanalComunicacionesEnumerator canalComunicaciones;

}
