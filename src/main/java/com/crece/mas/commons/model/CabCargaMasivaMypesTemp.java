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
@Table(name = "cab_carga_masiva_mypes_temp", schema = "public", catalog = "crecemasdb")
public class CabCargaMasivaMypesTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ccm_id")
    private long ccmId;

    @Column(name = "ccm_total")
    private Long ccmTotal;

    @Column(name = "ccm_exito")
    private Long ccmExito;

    @Column(name = "ccm_error")
    private Long ccmError;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ccm_fecha")
    private Date ccmFecha;

}
