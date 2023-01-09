package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sponsors_avisos_dias", schema = "public", catalog = "crecemasdb")
public class SponsorsAvisosDias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sad_id")
    private long sadId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sad_sav_id", referencedColumnName = "sav_id", nullable = false)
    private SponsorsAvisos sponsorsAvisos;

    @Column(name = "sad_dia")
    private String sadDia;

    @Column(name = "sad_activo")
    private Boolean sadActivo;

}
