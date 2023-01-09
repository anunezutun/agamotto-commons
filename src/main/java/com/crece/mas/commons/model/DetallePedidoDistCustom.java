package com.crece.mas.commons.model;

import java.math.BigDecimal;

public interface DetallePedidoDistCustom {

    Long getSpp_id();

    String getSpp_codigo();

    String getFab_razon_social();

    String getMar_nombre();

    String getDps_nombre();

    String getDps_presentacion();

    BigDecimal getDps_medida();

    String getDps_ume_codigo();

    BigDecimal getDps_cantidad_solicitada();

    BigDecimal getDps_cantidad_confirmada();

    BigDecimal getDps_precio_presentado();

    BigDecimal getDps_precio_confirmado();

    Long getDps_codigo_descuento();

    Long getDps_codigo_bonificacion();

    BigDecimal getDps_monto_descuento();

    BigDecimal getDps_precio_solicitado();

    BigDecimal getDps_total_linea();

    BigDecimal getDps_porcentaje_descuento();

    BigDecimal getDps_monto_descuentog();
}
