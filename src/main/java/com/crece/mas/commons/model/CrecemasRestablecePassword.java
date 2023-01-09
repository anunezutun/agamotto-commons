package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_restablece_password", schema = "public", catalog = "crecemasdb")
public class CrecemasRestablecePassword {
    @Id
    @Column(name = "crp_token_id")
    private String crpTokenId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crp_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "crp_fecha_activacion")
    private Date crpFechaActivacion;

    @Column(name = "crp_activo")
    private Boolean crpActivo;

    @Column(name = "crpApp")
    private String crp_app;
}
