package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.stream.Stream;

public enum TipoVentaEnumerator implements IGenericEnumerator<Integer> {
    SELL_OUT (0, "Sell Out"),
    SELL_IN (1, "Sell In");

    private int code;
    private String description;

    TipoVentaEnumerator(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TipoVentaEnumerator{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static TipoVentaEnumerator of(int code){
        return Stream.of(TipoVentaEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe la unidad de medida:" + code));
    }
}
