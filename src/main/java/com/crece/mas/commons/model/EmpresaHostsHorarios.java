package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts_horarios", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsHorarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehh_id")
    private long ehhId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehh_eho_ruc", referencedColumnName = "eho_ruc")
    private EmpresaHost empresaHost;

    @Column(name = "ehh_dia")
    private String ehhDia;

    @Column(name = "ehh_atencion")
    private Boolean ehhAtencion;

    @Column(name = "ehh_hora_inicio")
    private String ehhHoraInicio;

    @Column(name = "ehh_hora_fin")
    private String ehhHoraFin;

}
