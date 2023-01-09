package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.BannerStateEnumerator;
import com.crece.mas.commons.enumerator.ShoppingCartItemStateEnumerator;
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
@Table(name = "shoppping_cart_item", schema = "public", catalog = "crecemasdb")
public class ShoppingCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sci_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sci_spp_id", referencedColumnName = "spp_id", nullable = false)
    private SponsorProducto sponsorProducto;

    @Column(name = "sci_quantity")
    private BigDecimal quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sc_id", referencedColumnName = "sc_id", nullable = false)
    private ShoppingCart shoppingCart;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sci_registerdate",nullable = false,updatable = false)
    private Date registerDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sci_updatedate",nullable = false)
    private Date updateDate;

    @Column(name = "sci_state")
    private ShoppingCartItemStateEnumerator state;

    @PrePersist
    public void onPrePersist() {
        Date currentDate = new Date();
        setRegisterDate(currentDate);
        setUpdateDate(currentDate);
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdateDate(new Date());
    }

}
