package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios", schema = "public", catalog = "crecemasdb")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 3008157788475866864L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private long usuId;

    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @Size(min = 0, max = 255)
    @Column(name = "usu_correo", unique = true)
    private String usuCorreo;

    @Column(name = "usu_password")
    private String usuPassword;

    @NotEmpty
    @Column(name = "usu_numero_documento")
    private String usuNumeroDocumento;

    @NotEmpty
    @Size(min = 2, max = 255)
    @Column(name = "usu_nombre")
    private String usuNombre;

    @Column(name = "usu_apellido_paterno")
    private String usuApellidoPaterno;

    @Column(name = "usu_apellido_materno")
    private String usuApellidoMaterno;

    @Column(name = "usu_telefono", unique = true)
    private String usuTelefono;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "usu_fecha_registro")
    private Date usuFechaRegistro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "usu_fecha_ultimo_ingreso")
    private Date usuFechaUltimoIngreso;

    @Column(name = "usu_vigente")
    private boolean usuVigente;

    @Column(name = "usu_password_temporal")
    private boolean usuPasswordTemporal;

    @Column(name = "usu_tdo_codigo")
    private TipoDocumentoEnumerator tipoDocumento;

    @Transient
    @JsonProperty
    private List<Long> roles;

}
