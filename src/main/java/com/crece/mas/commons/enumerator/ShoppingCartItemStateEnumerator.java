package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.stream.Stream;

@RequiredArgsConstructor
public enum ShoppingCartItemStateEnumerator implements IGenericEnumerator<Integer> {

    INACTIVE(0, "Inactivo"),
    ACTIVE(1, "Activo");

    private final int code;
    private final String description;

    @Override
    public String toString() {
        return "ShoppingCartItemStateEnumerator{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static ShoppingCartItemStateEnumerator fromDescription(String description) {
        return Stream.of(ShoppingCartItemStateEnumerator.values())
            .filter(shoppingCartItemStateEnumerator -> shoppingCartItemStateEnumerator.getDescription().equalsIgnoreCase(description))
            .findFirst()
            .orElseThrow(()-> new CreceMasNotFoundException("No existe estado de item con descripcion: " + description));
    }

    public static ShoppingCartItemStateEnumerator fromCode(int code) {
        return Stream.of(ShoppingCartItemStateEnumerator.values())
            .filter(shoppingCartItemStateEnumerator -> shoppingCartItemStateEnumerator.getCode().equals(code))
            .findFirst()
            .orElseThrow(()-> new CreceMasNotFoundException("No existe estado de item con codigo: " + code));
    }
}
