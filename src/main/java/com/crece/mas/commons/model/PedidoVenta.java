package com.crece.mas.commons.model;

import java.math.BigDecimal;

public interface PedidoVenta {

    Long getPed_id();
    Long getCli_id();
    String getCli_nombre();
    Boolean getCli_favoritos();
    String getPed_estado();
    String getPed_mon_codigo();
    BigDecimal getPed_monto_total();
    BigDecimal getEhoDistancia();
    BigDecimal getPed_clongitud();
    BigDecimal getPed_clatitud();
    String getPed_canal();
}
