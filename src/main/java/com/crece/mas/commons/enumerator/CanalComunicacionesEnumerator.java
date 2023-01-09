package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.stream.Stream;

public enum CanalComunicacionesEnumerator implements IGenericEnumerator<String> {

    TELEFONO("TEL", "Teléfono"),
    CELULAR("CEL", "Celular"),
    EMAIL("EML", "Correo Electrónico"),
    WHATSAPP("WAP", "WhatsApp");

    private final String code;
    private final String description;

    CanalComunicacionesEnumerator(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static CanalComunicacionesEnumerator of(String code){
        return Stream.of(CanalComunicacionesEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe canal de comunicacion:" + code));
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
        return "CanalComunicacionesEnumerator{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
