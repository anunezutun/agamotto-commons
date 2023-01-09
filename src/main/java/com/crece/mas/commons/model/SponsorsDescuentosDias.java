package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_descuentos_dias", schema = "public", catalog = "crecemasdb")
public class SponsorsDescuentosDias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sdd_id")
    private long sddId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sdd_sde_id", referencedColumnName = "sde_id")
    private SponsorsDescuentos sponsorsDescuentos;

    @Column(name = "sdd_dia")
    private String sddDia;

    @Column(name = "sdd_activo")
    private Boolean sddActivo;

}
