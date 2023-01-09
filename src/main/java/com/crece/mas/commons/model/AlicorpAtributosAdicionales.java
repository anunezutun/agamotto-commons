package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alicorp_atributos_adicionales", schema = "public", catalog = "crecemasdb")
public class AlicorpAtributosAdicionales implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aaa_id")
    private long aaaId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "aaa_spo_ruc", referencedColumnName = "spp_spo_ruc"),
            @JoinColumn(name = "aaa_spp_codigo", referencedColumnName = "spp_codigo")
    })
    private SponsorProducto sponsorProducto;

    @Column(name = "aaa_cpgs")
    private Boolean aaaCpgs;

    @Column(name = "aaa_codigo_cpg")
    private String aaaCodigoCpg;

    @Column(name = "aaa_familia_katu")
    private String aaaFamiliaKatu;

    @Column(name = "aaa_presentacion")
    private String aaaPresentacion;

    @Column(name = "aaa_familia_katu_ap")
    private String aaaFamiliaKatuAp;

    @Column(name = "aaa_presentacion_ap")
    private String aaaPresentacionAp;

}
