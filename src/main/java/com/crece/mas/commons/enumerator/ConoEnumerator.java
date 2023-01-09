package com.crece.mas.commons.enumerator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ConoEnumerator implements IGenericEnumerator<Integer>{
    NORTH(0, "Norte"),
    SOUTH(1, "Sur"),
    CENTER(2, "Centro"),
    EAST(3, "Este"),
    WEST(4, "Oeste");

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
