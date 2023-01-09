package com.crece.mas.commons.enumerator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum MypeStatusEnumerator implements IGenericEnumerator<Integer>{
    ACTIVE(0, "Activo"),
    INACTIVE(1,"De baja"),
    SUSPENDED(2, "Suspendido");

    Integer code;
    String description;
    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
