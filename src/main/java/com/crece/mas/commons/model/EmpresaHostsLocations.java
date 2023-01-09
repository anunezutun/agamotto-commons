package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts_locations", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsLocations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehl_id", insertable = false, updatable = false)
    private long ehlId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehl_eho_ruc", referencedColumnName = "eho_ruc", nullable = false, insertable = false, updatable = false)
    private EmpresaHost empresaHost;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehl_ubi_code", referencedColumnName = "ubi_codigo", nullable = false, insertable = false, updatable = false)
    private Ubigeo ubigeo;
    
    @Column(name = "ehl_eho_ruc")
    private String ehlEhoRuc;

    @Column(name = "ehl_latitude")
    private BigDecimal ehlLatitude;

    @Column(name = "ehl_longitude")
    private BigDecimal ehlLongitude;

    @Column(name = "ehl_ubi_code")
    private String ehlUbiCode;

    @Column(name = "ehl_address")
    private String ehlAddress;

    @Column(name = "ehl_postal_code")
    private String ehlPostalCode;

    @Column(name = "ehl_reference")
    private String ehlReference;

    @Column(name = "ehl_cono")
    private Integer ehlCono;

    @Column(name = "ehl_active_start1")
    private String ehlActiveStart1;

    @Column(name = "ehl_active_end1")
    private String ehlActiveEnd1;

    @Column(name = "ehl_active_start2")
    private String ehlActiveStart2;

    @Column(name = "ehl_active_end2")
    private String ehlActiveEnd2;
}
