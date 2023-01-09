package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_subcategorias_productos", schema = "public", catalog = "crecemasdb")
public class SponsorsSubcategoriasProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ssp_id")
    private Long sspId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ssp_spp_id", referencedColumnName = "spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ssp_ssu_id", referencedColumnName = "ssu_id", nullable = false)
    private SponsorSubcategoria sponsorSubcategoria;
}