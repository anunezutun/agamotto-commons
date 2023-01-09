package com.crece.mas.commons.model;

import java.math.BigDecimal;
import java.util.Date;

public interface PedidoVentaId {

    Long getPed_id();
    String getEho_nombre_fantasia();
    String getEho_direccion();
    Long getCli_id();
    String getCli_tdo_codigo();
    String getTpa_codigo();
    String getTpa_descripcion();
    String getTco_codigo();
    String getTco_descripcion();
    String getCli_numero_documento();
    String getCli_nombre();
    Boolean getCli_favoritos();
    String getDcl_direccion();
    String getPed_estado();
    Date getPed_fecha();
    String getPed_mon_codigo();
    BigDecimal getPed_monto_total();
    BigDecimal getEhodistancia();
    BigDecimal getPed_clongitud();
    BigDecimal getPed_clatitud();
    String getPed_canal();
}
