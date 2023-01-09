package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_subcategorias", schema = "public", catalog = "crecemasdb")
public class SponsorSubcategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ssu_id")
    private Long ssuId;

    @Column(name = "ssu_nombre")
    private String ssuNombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ssu_sca_id", referencedColumnName = "sca_id", nullable = false)
    private SponsorCategoria sponsorCategoria;

    @Column(name = "ssu_codigo")
    private String ssuCodigo;
    
    @Column(name = "ssu_image")
    private String ssuImage;
    
    @Column(name = "ssu_icon")
    private String ssuIcon;
    
    @Column(name = "ssu_icon_inactive")
    private String ssuIconInactive;
}