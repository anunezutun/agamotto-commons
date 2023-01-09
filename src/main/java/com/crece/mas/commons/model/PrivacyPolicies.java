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
@Table(name = "privacy_policies", schema = "public")
public class PrivacyPolicies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ppo_id")
    private long ppoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ppo_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ppo_date")
    private Date ppoDate;

    @PrePersist
    public void onPrePersist() {
    	setPpoDate(new Date());
    }
}