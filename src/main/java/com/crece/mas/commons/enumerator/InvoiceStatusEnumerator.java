package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.stream.Stream;

public enum InvoiceStatusEnumerator implements IGenericEnumerator<String> {

    GENERATE("GENERATE", "Generado"),
    INVOICE_SENT("INVOICE_SENT", "Enviado a SUNAT"),
    INVOICE_ERROR("INVOICE_ERROR", "Enviado con errores");

    private final String code;
    private final String description;

    InvoiceStatusEnumerator(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static InvoiceStatusEnumerator of(String code){
        return Stream.of(InvoiceStatusEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe el estado:" + code));
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
