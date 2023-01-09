package com.crece.mas.commons.enumerator;

public enum RatingEnumerator implements IGenericEnumerator<Integer>{
    ALL(0, "Todas las calificaciones"),
    LOW(1,"Baja"),
    MEDIUM(2, "Media"),
    REGULAR(3, "Regular"),
    HIGH(4, "Alta"),
    EXCELLENT(5, "Excelente");

    Integer code;
    String description;

    RatingEnumerator(Integer code, String description){
        this.code = code;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
