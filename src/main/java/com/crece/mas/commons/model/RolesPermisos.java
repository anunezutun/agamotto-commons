package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles_permisos", schema = "public", catalog = "crecemasdb")
public class RolesPermisos {
    @Id
    @Column(name = "rpe_id")
    private long rpeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rpe_rol_id", referencedColumnName = "rol_id", nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rpe_per_id", referencedColumnName = "per_id", nullable = false)
    private Permiso permiso;

}
