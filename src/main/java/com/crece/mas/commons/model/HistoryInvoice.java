package com.crece.mas.commons.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "history_invoice", schema = "public", catalog = "crecemasdb")
public class HistoryInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hin_id")
    private long hinId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hin_ven_id", referencedColumnName = "ven_id", nullable = false)
    private Venta venta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "hin_date")
    private Date hinDate;

    @Column(name = "hin_quantity")
    private BigDecimal hinQuantity;

    @Column(name = "hin_total_amount")
    private BigDecimal hinTotalAmount;

    @Column(name = "hin_tpa_code")
    private String hinTpaCode;

    @Column(name = "hin_tco_code")
    private String hinTcoCode;   
    
    @Column(name = "hin_invoice_id_document")
    private String hinInvoiceIdDocument;

    @Column(name = "hin_invoice_status")
    private String hinInvoiceStatus;

    @Column(name = "hin_invoice_status_document")
    private String hinInvoiceStatusDocument;
       
    @Column(name = "hin_invoice_status_sunat")
    private String hinInvoiceStatusSunat;
        
    @Column(name = "hin_invoice_signature")
    private String hinInvoiceSignature;
    
    @Column(name = "hin_invoice_hash_code")
    private String hinInvoiceHashCode;
        
    @Column(name = "hin_invoice_pdf_url")
    private String hinInvoicePdfUrl;
    
    @Column(name = "hin_invoice_xml_sign_url")
    private String hinInvoiceXmlSignUrl;
    
    @Column(name = "hin_invoice_xml_sunat_url")
    private String hinInvoiceXmlSunatUrl;
        
    @Column(name = "hin_invoice_err_messages")
    private String hinInvoiceErrMessages;
    
    @Column(name = "hin_invoice_provider_status")
    private String hinInvoiceProviderStatus;
        
    @Column(name = "hin_customer_name")
    private String hinCustomerName;

    @Column(name = "hin_customer_document")
    private String hinCustomerDocument;
    
    @Column(name = "hin_ticket_number")
    private Long hinTicketNumber;

}
