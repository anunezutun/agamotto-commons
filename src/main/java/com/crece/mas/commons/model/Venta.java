package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.InvoiceStatusEnumerator;
import com.crece.mas.commons.enumerator.MonedaEnumerator;
import com.crece.mas.commons.enumerator.TipoComprobanteEnumerador;
import com.crece.mas.commons.enumerator.TipoPagoEnumerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ventas", schema = "public", catalog = "crecemasdb")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_id")
    private long venId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ven_fecha")
    private Date venFecha;

    @Column(name = "ven_documento_electronico")
    private boolean venDocumentoElectronico;

    @Column(name = "ven_monto_descuento")
    private BigDecimal venMontoDescuento;

    @Column(name = "ven_monto_total")
    private BigDecimal venMontoTotal;

    @Column(name = "ven_monto_igv")
    private BigDecimal venMontoIgv;

    @Column(name = "ven_mon_codigo")
    private MonedaEnumerator moneda;

    @Column(name = "ven_tpa_codigo")
    private TipoPagoEnumerator tipoPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ven_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ven_egu_ruc", referencedColumnName = "egu_ruc", nullable = false)
    private EmpresaGuest empresaGuest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ven_cli_id", referencedColumnName = "cli_id", nullable = false)
    private Cliente cliente;

    @Column(name = "ven_tco_codigo")
    private TipoComprobanteEnumerador tipoComprobante;

    @Column(name = "ven_monto_subtotal")
    private BigDecimal venMontoSubtotal;

    @Column(name = "ven_estado")
    private String venEstado;

    @Column(name = "ven_canal")
    private String venCanal;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "venta")
    private List<DetalleVenta> venDetalles;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "venta", cascade = CascadeType.ALL)
    private Ticket venTicket;

    @Column(name = "ven_guid")
    private String venGuid;

    @Column(name = "ven_id_document")
    private String documentId;

    @Column(name = "ven_bizlinks_status")
    private String invoiceProviderStatus;

    @Column(name = "ven_bizlinks_status_document")
    private String invoiceStatusDocument;

    @Column(name = "ven_bizlinks_status_sunat")
    private String invoiceStatusSunat;

    @Column(name = "ven_invoice_signature_value")
    private String invoiceSignaturaValue;

    @Column(name = "ven_invoice_hash_code")
    private String invoiceHashCode;

    @Column(name = "ven_invoice_pdf_file_url")
    private String invoicePdfFileUrl;

    @Column(name = "ven_invoice_xml_file_sign_url")
    private String invoiceXmlFileSignUrl;

    @Column(name = "ven_invoice_xml_file_sunat_url")
    private String invoiceXmlFileSunatUrl;

    @Column(name = "ven_bizlinks_err_messages")
    private String invoiceErrMessages;

    @Column(name = "ven_status_invoice")
    private InvoiceStatusEnumerator statusInvoice;

    @Column(name = "ven_invoice_customer_name")
    private String invoiceCustomerName;

    @Column(name = "ven_invoice_customer_document")
    private String invoiceCustomerDocument;
    
    @Column(name = "ven_doc_sequence")
    private Long docSequence;

    @PrePersist
    public void onPrePersist() {
        setStatusInvoice(InvoiceStatusEnumerator.GENERATE);
    }

}
