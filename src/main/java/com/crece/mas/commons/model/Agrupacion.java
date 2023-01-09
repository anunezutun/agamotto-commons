package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agrupaciones", schema = "public", catalog = "crecemasdb")
public class Agrupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agr_id")
    private long agrId;

    @Column(name = "agr_nombre")
    private String agrNombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agr_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;
}
