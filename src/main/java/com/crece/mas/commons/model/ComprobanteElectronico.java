package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comprobantes_electronicos", schema = "public", catalog = "crecemasdb")
public class ComprobanteElectronico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cel_id")
    private long celId;

    @Column(name = "cel_tipo")
    private String celTipo;

    @Column(name = "cel_serie")
    private String celSerie;

    @Column(name = "cel_correlativo")
    private Long celCorrelativo;

    @Column(name = "cel_fecha_emision")
    private Date celFechaEmision;

    @Column(name = "cel_tipo_operacion")
    private String celTipoOperacion;

    @Column(name = "cel_respuesta_pse")
    private Long celRespuestaPse;

    @Column(name = "cel_respuesta_sunat")
    private Long celRespuestaSunat;

    @Column(name = "cel_emisor_ruc")
    private String celEmisorRuc;

    @Column(name = "cel_emisor_razon_social")
    private String celEmisorRazonSocial;

    @Column(name = "cel_emisor_nombre_comercial")
    private String celEmisorNombreComercial;

    @Column(name = "cel_emisor_codigo_establecimiento")
    private String celEmisorCodigoEstablecimiento;

    @Column(name = "cel_emisor_ubigeo")
    private Long celEmisorUbigeo;

    @Column(name = "cel_emisor_direccion")
    private String celEmisorDireccion;

    @Column(name = "cel_emisor_provincia")
    private String celEmisorProvincia;

    @Column(name = "cel_emisor_departamento")
    private String celEmisorDepartamento;

    @Column(name = "cel_emisor_distrito")
    private String celEmisorDistrito;

    @Column(name = "cel_adquiriente_tipo_documento")
    private String celAdquirienteTipoDocumento;

    @Column(name = "cel_adquiriente_numero_documento")
    private String celAdquirienteNumeroDocumento;

    @Column(name = "cel_adquiriente_nombre")
    private String celAdquirienteNombre;

    @Column(name = "cel_adquiriente_email")
    private String celAdquirienteEmail;

    @Column(name = "cel_moneda")
    private String celMoneda;

    @Column(name = "cel_nota_sustento")
    private String celNotaSustento;

    @Column(name = "cel_nota_tipo")
    private String celNotaTipo;

    @Column(name = "cel_subtotal")
    private BigDecimal celSubtotal;

    @Column(name = "cel_descuento_global_codigo")
    private String celDescuentoGlobalCodigo;

    @Column(name = "cel_descuento_global_monto_base")
    private BigDecimal celDescuentoGlobalMontoBase;

    @Column(name = "cel_descuento_global_factor")
    private BigDecimal celDescuentoGlobalFactor;

    @Column(name = "cel_descuento_global_valor")
    private BigDecimal celDescuentoGlobalValor;

    @Column(name = "cel_valor_operaciones_gravadas")
    private BigDecimal celValorOperacionesGravadas;

    @Column(name = "cel_valor_operaciones_exoneradas")
    private BigDecimal celValorOperacionesExoneradas;

    @Column(name = "cel_valor_operaciones_inafectas")
    private BigDecimal celValorOperacionesInafectas;

    @Column(name = "cel_valor_operaciones_exportadas")
    private BigDecimal celValorOperacionesExportadas;

    @Column(name = "cel_sumatoria_impuesto_tipo")
    private String celSumatoriaImpuestoTipo;

    @Column(name = "cel_sumatoria_impuesto_monto_base")
    private BigDecimal celSumatoriaImpuestoMontoBase;

    @Column(name = "cel_sumatoria_impuesto_factor")
    private BigDecimal celSumatoriaImpuestoFactor;

    @Column(name = "cel_sumatoria_impuesto_valor")
    private BigDecimal celSumatoriaImpuestoValor;

    @Column(name = "cel_importe_total")
    private BigDecimal celImporteTotal;

    @Column(name = "cel_forma_pago")
    private String celFormaPsgo;

    @Column(name = "cel_nota_referencia_tipo")
    private String celNotaReferenciaTipo;

    @Column(name = "cel_nota_referencia_serie")
    private String celNotaReferenciaSerie;

    @Column(name = "cel_nota_referencia_numero")
    private Long celNotaReferenciaNumero;

    @Column(name = "cel_nota_referencia_fecha")
    private Date celNotaReferenciaFecha;

    @Column(name = "cel_estado")
    private String celEstado;
}
