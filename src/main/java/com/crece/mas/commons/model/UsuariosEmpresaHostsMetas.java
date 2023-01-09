package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios_empresa_hosts_metas", schema = "public", catalog = "crecemasdb")
public class UsuariosEmpresaHostsMetas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ume_id")
    private long umeId;

    @Column(name = "ume_nombre")
    private String umeNombre;

    @Column(name = "ume_valor")
    private BigDecimal umeValor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ume_ueh_id", referencedColumnName = "ueh_id", nullable = false)
    private UsuariosEmpresaHosts usuariosEmpresaHosts;

}
