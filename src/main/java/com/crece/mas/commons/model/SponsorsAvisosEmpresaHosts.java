package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_avisos_empresa_hosts", schema = "public", catalog = "crecemasdb")
public class SponsorsAvisosEmpresaHosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seh_id")
    private long sehId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seh_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seh_sav_id", referencedColumnName = "sav_id", nullable = false)
    private SponsorsAvisos sponsorsAvisos;

}
