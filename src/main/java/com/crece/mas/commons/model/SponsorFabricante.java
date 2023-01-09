package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_fabricantes", schema = "public", catalog = "crecemasdb")
public class SponsorFabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sfa_id")
    private Long sfaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sfa_fab_ruc", referencedColumnName = "fab_ruc", nullable = false)
    private Fabricante fabricante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sfa_spo_ruc", referencedColumnName = "spo_ruc", nullable = false)
    private Sponsor sponsor;
}