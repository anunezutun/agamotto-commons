package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shoppping_cart", schema = "public", catalog = "crecemasdb")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sc_id")
    private long id;

    @Column(name = "sc_guid", nullable = false,updatable = false)
    private String guid;

    @Column(name = "sc_changesflag")
    private Boolean changesFlag;

    @Column(name = "sc_eho_ruc")
    private String empresaHostRuc;

    @Column(name = "sc_spo_ruc")
    private String sponsorRuc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sc_registerdate",nullable = false,updatable = false)
    private Date registerDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sc_updatedate",nullable = false)
    private Date updateDate;

    @PrePersist
    public void onPrePersist() {
        Date currentDate = new Date();
        setRegisterDate(currentDate);
        setUpdateDate(currentDate);
        setGuid(UUID.randomUUID().toString());
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdateDate(new Date());
    }

}
