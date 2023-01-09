package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts_tipos_pago_bancos", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsTiposPagoBancos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "epb_id")
    private long epbId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "epb_eht_id", referencedColumnName = "eht_id", nullable = false)
    private EmpresaHostsTipoPagos empresaHostsTipoPagos;

    @Column(name = "epb_nombre_entidad")
    private String epbNombreEntidad;

    @Column(name = "epb_tdo_codigo")
    private TipoDocumentoEnumerator tipoDocumento;

    @Column(name = "epb_numero_documento")
    private String epbNumeroDocumento;

    @Column(name = "epb_nombre")
    private String epbNombre;

    @Column(name = "epb_telefono", unique = true)
    private String epbTelefono;

    @Column(name = "epb_cuenta_ahorros")
    private String epbCuentaAhorros;

    @Column(name = "epb_cuenta_corriente")
    private String epbCuentaCorriente;

    @Column(name = "epb_cuenta_interbancaria")
    private String epbCuentaInterbancaria;

}
