package com.crece.mas.commons.enumerator;

public enum AppModuloEnumerator implements IGenericEnumerator<Integer> {

    PEDIDOS(0, "pedidos"),
    VENTAS(1, "ventas"),
    DISTRIBUIDORES(2, "distribuidores"),
    ADMINISTRACION(3, "administracion");

    private final int code;
    private final String description;

    AppModuloEnumerator(int code, String description) {
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