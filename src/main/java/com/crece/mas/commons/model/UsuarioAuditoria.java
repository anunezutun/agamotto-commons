package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario_auditoria", schema = "public", catalog = "crecemasdb")
public class UsuarioAuditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_aud_id")
    private Long usuAudId;

    @Column(name = "usu_aud_fecha")
    @CreationTimestamp
    private Timestamp usuAudFecha;

    @Column(name = "usu_aud_accion")
    private String usuAudAccion;

    @Column(name = "usu_aud_id_usu")
    private Long usu_aud_id_usu;

}
