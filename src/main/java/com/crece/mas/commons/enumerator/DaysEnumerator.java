package com.crece.mas.commons.enumerator;

import java.util.Optional;
import java.util.stream.Stream;

public enum DaysEnumerator implements IGenericEnumerator<Integer>{
    MONDAY(0, "Lunes", 1),
    TUESDAY(1, "Martes", 2),
    WEDNESDAY(2, "Miércoles", 3),
    THURSDAY(3, "Jueves", 4),
    FRIDAY(4, "Viernes", 5),
    SATURDAY(5, "Sábado", 6),
    SUNDAY(6,"Domingo", 7);

    int code;
    String desciption;
    /**
     * Integer value from ZonedDateTime representing the current day of week
     */
    private final int dayOfWeek;

    DaysEnumerator(Integer code, String description, int dayOfWeek){
        this.code = code;
        this.desciption = description;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return desciption;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public static Optional<DaysEnumerator> fromDayOfWeek(int dayOfWeek) {
        return Stream.of(DaysEnumerator.values())
                .filter(diaEnumerator -> diaEnumerator.getDayOfWeek() == dayOfWeek).findFirst();
    }
}
