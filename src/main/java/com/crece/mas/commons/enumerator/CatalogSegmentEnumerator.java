package com.crece.mas.commons.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CatalogSegmentEnumerator implements IGenericEnumerator<Integer> {
    SEGMENT_NONE(0, "Sin Segmento"),
    SEGMENT_1(1, "Segmento Arca (Piloto)");

    private final Integer code;
    private final String description;
}
