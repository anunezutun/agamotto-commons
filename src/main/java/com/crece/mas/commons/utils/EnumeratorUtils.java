package com.crece.mas.commons.utils;

import com.crece.mas.commons.enumerator.IGenericEnumerator;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class EnumeratorUtils {
    public static <T> Optional<IGenericEnumerator<T>> findByCode(IGenericEnumerator<T>[] values, T code) {
        return Stream.of(values)
                .filter(m -> m.getCode().equals(code))
                .findFirst();
    }
    public static <T> boolean exist(IGenericEnumerator<T>[] values, T code) {
        return Stream.of(values)
                .filter(m -> m.getCode().equals(code))
                .count() > 0;
    }
    public static <T> Optional<IGenericEnumerator<T>> findByDescription(IGenericEnumerator<T>[] values, String description) {
        return Stream.of(values)
                .filter(m -> m.getDescription().equalsIgnoreCase(description))
                .findFirst();
    }

   /*public static <T> IGenericEnumerator<T> findByCode(IGenericEnumerator[] values, T code) {
        return Stream.of(values)
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }*/
}
