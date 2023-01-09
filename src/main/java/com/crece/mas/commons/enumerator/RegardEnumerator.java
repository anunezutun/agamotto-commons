package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.utils.EnumeratorUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RegardEnumerator implements IGenericEnumerator<Integer> {

    NOMINAL(1, "Nominal S/"),
    PERCENTAGE(2, "Percentage %"),
    SKU(3, "Product with SKU");

    private final Integer code;
    private final String description;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @JsonCreator
    public static RegardEnumerator create(Integer intValue) {
        if (intValue == null) {
            return null;
        }
        return (RegardEnumerator) EnumeratorUtils.findByCode(values(), intValue)
                .orElseThrow(IllegalArgumentException::new);
    }
}
