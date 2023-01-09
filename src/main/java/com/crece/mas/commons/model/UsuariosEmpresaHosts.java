package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios_empresa_hosts", schema = "public", catalog = "crecemasdb")
public class UsuariosEmpresaHosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ueh_id")
    private Long uehId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ueh_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ueh_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

}
