package com.crece.mas.commons.model;

import java.math.BigDecimal;

public interface ProductoStatistics {

     String getPalCodigo();
     String getPalDescripcion();
     boolean getPalCustomizado();
     boolean getPalActivo();
     String getPalMarca();
     BigDecimal getPalMedida();
     BigDecimal getPalCantidadDisponible();
     BigDecimal getPalPrecioLista();
     BigDecimal getPalPrecioMinimo();
     BigDecimal getPalUmbralReposicion();
     String getPalImagen();
     String getPalMonCodigo();
     String getPalMprCodCrecemas();
     String getPalEhoRuc();
     String getPalUmeCodigo();
     BigDecimal getPalCantidadMaximaVenta();
     Long getPalUsuId();
     String getPalPresentacion();
     Boolean getPalVentasParciales();

}
