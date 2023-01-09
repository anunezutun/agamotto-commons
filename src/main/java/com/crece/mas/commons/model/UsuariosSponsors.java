package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios_sponsors", schema = "public", catalog = "crecemasdb")
public class UsuariosSponsors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usp_id")
    private Long uspId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usp_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usp_spo_ruc", referencedColumnName = "spo_ruc", nullable = false)
    private Sponsor sponsor;

}
