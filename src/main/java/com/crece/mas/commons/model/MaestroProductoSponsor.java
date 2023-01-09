package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "maestro_productos_sponsors", schema = "public", catalog = "crecemasdb")
public class MaestroProductoSponsor {
    @Id
    @Column(name = "mps_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mpsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mps_mpr_cod_crecemas", referencedColumnName = "mpr_cod_crecemas", nullable = false)
    private MaestroProducto maestroProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mps_spp_id", referencedColumnName = "spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @Column(name = "mps_factor_conversion")
    private BigDecimal mpsFactorConversion;
}
