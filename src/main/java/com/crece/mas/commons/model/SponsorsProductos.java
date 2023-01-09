package com.crece.mas.commons.model;

import java.math.BigDecimal;

public interface SponsorsProductos {
    Long getSpp_id();

    String getSpp_codigo();

    String getFab_razon_social();

    String getMar_nombre();

    String getSpp_nombre();

    String getSca_nombre();

    String getSsu_nombre();

    String getSpp_presentacion();

    String getUme_descrpcion();

    BigDecimal getSpp_precio_lista();

    BigDecimal getSpp_cantidad_stock();

    String getSpp_imagen();

}
