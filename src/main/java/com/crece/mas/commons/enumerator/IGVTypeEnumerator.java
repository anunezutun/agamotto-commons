package com.crece.mas.commons.enumerator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum IGVTypeEnumerator implements IGenericEnumerator<Integer>{
    INCLUDED(0, "Incluido"),
    EXONERATED(1, "Exonerado");

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
