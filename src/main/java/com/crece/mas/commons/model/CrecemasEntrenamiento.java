package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crecemas_entrenamiento", schema = "public", catalog = "crecemasdb")
public class CrecemasEntrenamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cet_id")
    private long cetId;

    @Column(name = "cet_entorno")
    private String cetEntorno;

    @Column(name = "cet_tema")
    private String cetTema;

}
