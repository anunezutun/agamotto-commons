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
@Table(name = "usuarios_empresa_hosts_estadistica_ventas", schema = "public", catalog = "crecemasdb")
public class UsuariosEmpresaHostsEstadisticaVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uev_id")
    private long uevId;

    @Column(name = "uev_tipo")
    private String uevTipo;

    @Column(name = "uev_periodo")
    private Integer uevPeriodo;

    @Column(name = "uev_monto_ventas")
    private BigDecimal uevMontoVentas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uev_ueh_id", referencedColumnName = "ueh_id", nullable = false)
    private UsuariosEmpresaHosts usuariosEmpresaHosts;

}
