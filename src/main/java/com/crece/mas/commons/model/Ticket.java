package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets", schema = "public", catalog = "crecemasdb")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tic_id")
    private long ticId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tic_ven_id", referencedColumnName = "ven_id", nullable = false)
    private Venta venta;

    @Column(name = "tic_number")
    private long ticNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tic_date")
    private Date ticDate;
    
    @PrePersist
    public void onPrePersist() {
    	setTicDate(new Date());
    }
}
