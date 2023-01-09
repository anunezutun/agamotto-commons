package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "configuracion_hora_fecha_corte_pedido", schema = "public", catalog = "crecemasdb")
public class ConfiguracionHoraFechaCortePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conf_id")
    private Long confId;

    @Column(name = "conf_hora")
    private String confHora;

    @Column(name = "conf_frecuencia")
    private String confFrecuencia;

    @Column(name = "conf_prioridad")
    private Integer confPrioridad;

    @Column(name = "conf_activo")
    private Boolean confActivo;

}
