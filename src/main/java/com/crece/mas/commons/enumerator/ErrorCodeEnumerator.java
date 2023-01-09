package com.crece.mas.commons.enumerator;

public enum ErrorCodeEnumerator implements IGenericEnumerator<Integer> {

    DEFAULT(0, "Default Error"),
    ARGUMENT_EXCEPTION(1, "Argumento es nulo o vacio."),
    REST_SERVICE_EXCEPTION(2, "Error en el Servicio REST"),
    RESOURCE_CONFLICT(3, "Conflicto de recurso"),
    NO_CONTENT(4, "Sin datos"),
    API_ERROR(5, "Error en el Servicio"),
    API_ERROR_BD(6, "Error de Base de Datos");

    private final int code;
    private final String description;

    ErrorCodeEnumerator(int code, String description) {
        this.code = code;
        this.description = description;
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