package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_empresa_hosts_tipos", schema = "public", catalog = "crecemasdb")
public class SponsorsEmpresaHostsTipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sht_id")
    private long shtId;

    @Column(name = "sht_codigo")
    private String shtCodigo;

    @Column(name = "sht_descripcion")
    private String shtDescripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sht_spo_ruc", referencedColumnName = "spo_ruc")
    private Sponsor sponsor;

}
