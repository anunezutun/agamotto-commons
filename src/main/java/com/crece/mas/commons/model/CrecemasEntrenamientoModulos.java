package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_entrenamiento_modulos", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamientoModulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cem_id")
    private long cemId;

    @Column(name = "cem_numero")
    private Long cemNumero;

    @Column(name = "cem_nombre")
    private String cemNombre;

    @Column(name = "cem_imagen_certificado")
    private String cemImagenCertificado;

    @Column(name = "cem_cantidad_niveles")
    private Long cemCantidadNiveles;

    @Column(name = "cem_usuarios_activos")
    private Long cemUsuariosActivos;

    @Column(name = "cem_usuarios_finalizaron")
    private Long cemUsuariosFinalizaron;

    @Column(name = "cem_activo")
    private Boolean cemActivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cem_cet_id", referencedColumnName = "cet_id", nullable = false)
    private CrecemasEntrenamiento entrenamiento;

}
