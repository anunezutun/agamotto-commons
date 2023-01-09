package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios_estadisticas", schema = "public", catalog = "crecemasdb")
public class UsuariosEstadisticas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ues_id")
    private Long uesId;

    @Column(name = "ues_app_modulo")
    private String uesAppModulo;

    @Column(name = "ues_canal")
    private String uesCanal;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ues_fecha")
    private Date uesFecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ues_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

}
