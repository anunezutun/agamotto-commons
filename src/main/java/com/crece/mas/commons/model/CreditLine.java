package com.crece.mas.commons.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "credit_lines", schema = "public", catalog = "crecemasdb")
public class CreditLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cl_id")
    private long clId;
    
    @Column(name = "cl_erp_id")
    private BigInteger clErpCode;
    
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cl_eho_ruc", referencedColumnName = "eho_ruc", nullable = false, unique = true)
    private EmpresaHost empresaHost;

    @Column(name = "cl_total_line")
    private BigDecimal clTotalLine;
	
    @Column(name = "cl_available_line")
    private BigDecimal clAvailableLine;

    @Column(name = "cl_reserved_line")
    private BigDecimal clReservedLine;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cl_expiration_date")
    private Date clExpirationDate;
	
	@Column(name = "cl_deadline_days")
    private Integer clDeadlineDays;
    
}