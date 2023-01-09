package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.stream.Stream;

public enum TipoComprobanteEnumerador implements IGenericEnumerator<String> {

    BOLETA_GENERICA("BOLETA-GENERICA", "Boleta Generica","VENTA",false),
    NOTA_VENTA("NOTA-VENTA", "Nota de Venta","VENTA",false),
    BOLETA_ELECTRONICA("BOLETA-ELECTRONICA", "Boleta Electrónica","VENTA",true),
    FACTURA_ELECTRONICA("FACTURA-ELECTRONICA", "Factura Electrónica","VENTA",true),
    NOTA_CREDITO_ELECTRONICA("NOTA-CREDITO-ELECTRONICA", "Nota de Crédito Electrónica","AJUSTE",true);

    private final String code;
    private final String description;
    private final String type;
    private final Boolean isElectronic;

    TipoComprobanteEnumerador(String code, String description, String type, Boolean isElectronic) {
        this.code = code;
        this.description = description;
        this.type = type;
        this.isElectronic = isElectronic;
    }

    public static TipoComprobanteEnumerador of(String code){
        return Stream.of(TipoComprobanteEnumerador.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe tipo de comprobante:" + code));
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public Boolean getElectronic() {
        return isElectronic;
    }
}
