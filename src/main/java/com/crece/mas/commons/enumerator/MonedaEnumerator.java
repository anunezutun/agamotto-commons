package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.Optional;
import java.util.stream.Stream;

public enum MonedaEnumerator implements IGenericEnumerator<String> {
    PEN("PEN", "Sol", "S/"),
    USD("USD", "US Dollar", "US$");

    private final String code;
    private final String description;
    private final String symbol;

    MonedaEnumerator(String code, String description, String symbol) {
        this.code = code;
        this.description = description;
        this.symbol = symbol;
    }

    public static MonedaEnumerator of(String code){
        return Stream.of(MonedaEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe la moneda:" + code));
    }

    public static Optional<MonedaEnumerator> getIfPresent(String code){
        return Stream.of(MonedaEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst();
    }

    @Override
    public String getCode() {
        return code;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MonedaEnumerator{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    public String getSymbol() {
        return symbol;
    }
}
