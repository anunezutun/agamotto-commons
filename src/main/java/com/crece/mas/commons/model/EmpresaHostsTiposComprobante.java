package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.TipoComprobanteEnumerador;
import com.crece.mas.commons.enumerator.UnidadMedidaEnumerador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_hosts_tipos_comprobante", schema = "public", catalog = "crecemasdb")
public class EmpresaHostsTiposComprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ehc_id")
    private long ehcId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ehc_eho_ruc", referencedColumnName = "eho_ruc", nullable = false)
    private EmpresaHost empresaHost;

    @Column(name = "ehc_tco_codigo")
    private TipoComprobanteEnumerador tipoComprobante;

}
