package com.crece.mas.commons.enumerator;

public enum RoleEnumerator {

    ADMINISTRADOR(0, "ADMINISTRADOR"),
    PROPIETARIO(1, "PROPIETARIO"),
    GESTOR(2, "GESTOR"),
    VENDEDOR(3, "VENDEDOR"),
    PEDIDOS(4, "PEDIDOS"),
    DISTRIBUIDOR(5, "DISTRIBUIDOR");

    private final long code;
    private final String description;

    RoleEnumerator(long code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public long getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnumerator{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}