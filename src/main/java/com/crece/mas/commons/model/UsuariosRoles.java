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
@Table(name = "usuarios_roles", schema = "public", catalog = "crecemasdb")
public class UsuariosRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eur_id")
    private Long eurId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eur_rol_id", referencedColumnName = "rol_id", nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "eur_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @Column(name = "eur_fecha_activacion")
    private Date eurFechaActivacion;
}
