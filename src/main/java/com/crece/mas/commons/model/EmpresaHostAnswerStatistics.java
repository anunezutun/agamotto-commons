package com.crece.mas.commons.model;

import java.math.BigDecimal;
import java.util.Date;

public interface EmpresaHostAnswerStatistics {

    String getEhoRuc();

    String getEhoRazonSocial();

    String getEhoNombreFantasia();

    String getEhoDireccion();

    String getEhoDistrito();

    String getEhoProvincia();

    String getEhoDepartamento();

    Date getEhoFechaSolicitud();

    Date getEhoFechaActivacion();

    String getEhoRubros();

    BigDecimal getEhoClatitud();

    BigDecimal getEhoClongitud();

    boolean getEhoVigente();

    BigDecimal getEhoDistancia();

    String getEhoTemCodigo();

    String getEhoImagen();

}
