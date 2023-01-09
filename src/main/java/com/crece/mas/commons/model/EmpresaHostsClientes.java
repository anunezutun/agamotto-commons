package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "empresa_hosts_clientes", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsClientes {
    @Id
    @Column(name = "ecl_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eclId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ecl_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ecl_cli_id", referencedColumnName = "cli_id", nullable = false)
    private Cliente cliente;

}
