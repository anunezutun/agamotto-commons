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
@Table(name = "sponsors_invitaciones", schema = "public", catalog = "crecemasdb")
public class SponsorsInvitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spi_id")
    private long spiId;

    @Column(name = "spi_ruc")
    private String spiRuc;

    @Column(name = "spi_razon_social")
    private String spiRazonSocial;

    @Column(name = "spi_correo")
    private String spiCorreo;

    @Column(name = "spi_telefono_contacto")
    private String spiTelefonoContacto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "spi_fecha")
    private Date spiFecha;

    @Column(name = "spi_estado")
    private String spiEstado;

    @Column(name = "spi_spo_ruc")
    private String spiSpoRuc;

    @Column(name = "spi_nombre_contacto")
    private String spiNombreContacto;
}
