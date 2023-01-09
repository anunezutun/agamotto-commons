package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "descuentos_clientes", schema = "public", catalog = "crecemasdb")
public class CustomerDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "descuentos_clientes_id")
    private Long customerDiscountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sde_id", referencedColumnName = "sde_id")
    private SponsorsDescuentos sponsorsDiscount;

    @Column(name = "seh_eho_ruc")
    private String mypeDocumentNumber;
}
