package com.crece.mas.commons.enumerator;

import java.util.stream.Stream;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

public enum EstadoVentaEnumerator implements IGenericEnumerator<Integer> {

    ABIERTA(0, "abierta"),
    DESCARTADA(1, "descartada"),
    CERRADA(2, "cerrada"),
    ANULADA(3, "anulada");

    private final int code;
    private final String description;

    EstadoVentaEnumerator(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static EstadoVentaEnumerator of(String description) {
    	return Stream.of(EstadoVentaEnumerator.values())
    			.filter(x -> x.getDescription().equals(description))
    			.findFirst()
    			.orElseThrow(()-> new CreceMasNotFoundException("No existe estado: " + description)); 
    }
    
    @Override
    public String toString() {
        return "ErrorCodeEnumerator{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}