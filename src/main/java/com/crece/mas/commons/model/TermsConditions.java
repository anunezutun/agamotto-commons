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
@Table(name = "terms_conditions", schema = "public", catalog = "crecemasdb")
public class TermsConditions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tco_id")
    private long tcoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tco_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tco_date")
    private Date tcoDate;
    
    @PrePersist
    public void onPrePersist() {
    	setTcoDate(new Date());
    }
}