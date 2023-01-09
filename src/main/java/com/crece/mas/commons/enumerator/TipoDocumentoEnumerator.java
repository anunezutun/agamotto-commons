package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.stream.Stream;

public enum TipoDocumentoEnumerator implements IGenericEnumerator<String> {

    DNI("1", "DNI - Documento Nacional de Identidad","DNI","NATURAL", true),
    CE("4", "Carnet de Extranjería","CE","NATURAL", true),
    PA("7", "Pasaporte","PA","NATURAL", false),
    RUC("6", "RUC - Registro Unico de Contribuyetes","RUC","JURIDICO", true);

    private final String code;
    private final String description;
    private final String shortDescripction;
    private final String type;
    private final boolean enabled;

    TipoDocumentoEnumerator(String code, String description, String shortDescripction, String type, boolean enabled) {
        this.code = code;
        this.description = description;
        this.shortDescripction = shortDescripction;
        this.type = type;
        this.enabled = enabled;
    }

    public static TipoDocumentoEnumerator of(String code){
        return Stream.of(TipoDocumentoEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe tipo de documento:" + code));
    }

    public static TipoDocumentoEnumerator findByShortDescription(String shortDescripction){
        return Stream.of(TipoDocumentoEnumerator.values())
                .filter(m -> m.getShortDescripction().equals(shortDescripction))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe tipo de documento:" + shortDescripction));
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getShortDescripction() {
        return shortDescripction;
    }

    public String getType() {
        return type;
    }

    public boolean isEnabled() { return enabled; }
}