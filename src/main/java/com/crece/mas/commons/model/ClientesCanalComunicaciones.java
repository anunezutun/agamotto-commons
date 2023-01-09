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
@Table(name = "clientes_canal_comunicaciones", schema = "public", catalog = "crecemasdb")
public class ClientesCanalComunicaciones {
    @Id
    @Column(name = "ccc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cccId;

    @Column(name = "ccc_identificador_canal")
    private String cccIdentificadorCanal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ccc_cli_id", referencedColumnName = "cli_id", nullable = false)
    private Cliente cliente;
    
    @Column(name = "ccc_cco_id")
    private CanalComunicacionesEnumerator canalComunicaciones;

}
