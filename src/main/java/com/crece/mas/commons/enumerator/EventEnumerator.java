package com.crece.mas.commons.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventEnumerator implements IGenericEnumerator<Integer> {

    CREATE(1, "Create"),
    UPDATE(2, "Update"),
    DELETE(3, "Delete");

    Integer code;
    String description;
}
