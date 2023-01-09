package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum BannerStateEnumerator implements IGenericEnumerator<Integer> {

    INACTIVE(0, "Inactivo"),
    ACTIVE(1, "Activo");

    private final int code;
    private final String description;

    @Override
    public String toString() {
        return "BannerStateEnumerator{" +
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

    public static BannerStateEnumerator fromDescription(String description) {
        return Stream.of(BannerStateEnumerator.values())
            .filter(bannerStateEnum -> bannerStateEnum.getDescription().equalsIgnoreCase(description))
            .findFirst()
            .orElseThrow(()-> new CreceMasNotFoundException("No existe estado de banner con descripcion: " + description));
    }

    public static BannerStateEnumerator fromCode(int code) {
        return Stream.of(BannerStateEnumerator.values())
            .filter(bannerStateEnum -> bannerStateEnum.getCode().equals(code))
            .findFirst()
            .orElseThrow(()-> new CreceMasNotFoundException("No existe estado de banner con codigo: " + code));
    }
}
