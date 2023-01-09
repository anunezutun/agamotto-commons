package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ventas_comprobantes_electronicos", schema = "public", catalog = "crecemasdb")
public class VentasComprobantesElectronicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vce_id")
    private Long vceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vce_cel_id", referencedColumnName = "cel_id", nullable = false)
    private ComprobanteElectronico comprobanteElectronico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vce_ven_id", referencedColumnName = "ven_id", nullable = false)
    private Venta venta;

}
