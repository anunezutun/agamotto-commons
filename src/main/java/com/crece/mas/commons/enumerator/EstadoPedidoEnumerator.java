package com.crece.mas.commons.enumerator;

public enum EstadoPedidoEnumerator implements IGenericEnumerator<Integer> {

    ABIERTO(0, "abierto"),
    RECHAZADO(1, "rechazado"),
    NUEVO(2, "nuevo"),
    ACEPTADO(3, "aceptado"),
    DESPACHADO(4, "despachado"),
    ENTREGADO(5, "entregado"),
    CANCELADO(6, "cancelado");

    private final int code;
    private final String description;

    EstadoPedidoEnumerator(int code, String description) {
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