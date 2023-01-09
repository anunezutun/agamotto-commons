package com.crece.mas.commons.enumerator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DiscountStateEnumerator implements IGenericEnumerator<Integer> {

    REGISTERED(0, "registrado"),
    ACTIVE(1, "activo"),
    INACTIVE(2, "inactivo"),
    EXPIRED(3, "expirado");

    private final int code;
    private final String description;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
