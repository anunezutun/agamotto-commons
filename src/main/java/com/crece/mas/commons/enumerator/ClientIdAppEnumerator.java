package com.crece.mas.commons.enumerator;

public enum ClientIdAppEnumerator implements IGenericEnumerator<Integer> {

    APP_WEB_CRECEMAS_ADMIN(0, "app-web-crecemas-admin"),
    APP_WEB_CRECEMAS_VENTAS(1, "app-web-crecemas-ventas"),
    APP_WEB_CRECEMAS_DIST(2, "app-web-crecemas-dist"),
    APP_MOVIL_CRECEMAS_PEDIDOS(3, "app-movil-crecemas"),
    APP_MOVIL_CRECEMAS_ANONYMOUS(4, "app-movil-crecemas-anonymous");

    private final int code;
    private final String description;

    ClientIdAppEnumerator(int code, String description) {
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