package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.MonedaEnumerator;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class MonedaConverter implements AttributeConverter<MonedaEnumerator,String> {

    @Override
    public String convertToDatabaseColumn(MonedaEnumerator monedaEnumerator) {
        return Optional.ofNullable(monedaEnumerator)
                .map(MonedaEnumerator::getCode).orElse(null);
    }

    @Override
    public MonedaEnumerator convertToEntityAttribute(String code) {
        return toEntityAttribute(code);
    }
    
    public static MonedaEnumerator toEntityAttribute(String code){
        return Optional.ofNullable(code)
                .map(MonedaEnumerator::of).orElse(null);
    }
}
