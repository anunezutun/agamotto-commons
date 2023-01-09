package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes", schema = "public", catalog = "crecemasdb")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id")
    private long cliId;

    @Column(name = "cli_numero_documento")
    private String cliNumeroDocumento;

    @Column(name = "cli_nombre")
    private String cliNombre;

    @Column(name = "cli_calificacion")
    private Long cliCalificacion;

    @Column(name = "cli_tdo_codigo")
    private TipoDocumentoEnumerator tipoDocumento;

    @Column(name = "cli_usu_id", unique = true)
    private Long cliUsuId;

    @Column(name = "cli_favoritos")
    private Boolean cliFavoritos;

    @Column(name = "cli_fecha_activacion")
    private Date cliFechaActivacion;

}
