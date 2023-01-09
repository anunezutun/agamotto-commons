package com.crece.mas.commons.enumerator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SegmentEnumerator implements IGenericEnumerator<String>{
    SECTOR_A("A", "A"),
    SECTOR_B("B", "B"),
    SECTOR_C("C", "C"),
    SECTOR_D("D", "D");
    private String code;
    private String description;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
