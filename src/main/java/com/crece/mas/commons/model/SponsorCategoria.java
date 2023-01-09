package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_categorias", schema = "public", catalog = "crecemasdb")
public class SponsorCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sca_id")
    private Long scaId;

    @Column(name = "sca_nombre")
    private String scaNombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sca_spo_ruc", referencedColumnName = "spo_ruc", nullable = false)
    private Sponsor sponsor;

    @Column(name = "sca_codigo")
    private String scaCodigo;
    
    @Column(name = "sca_image")
    private String scaImage;
    
    @Column(name = "sca_icon")
    private String scaIcon;
    
    @Column(name = "sca_icon_inactive")
    private String scaIconInactive;

    @Column(name = "sca_priority")
    private Integer scaPriority;
}