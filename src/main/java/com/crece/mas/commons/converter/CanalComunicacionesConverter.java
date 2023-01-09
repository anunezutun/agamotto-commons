package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.CanalComunicacionesEnumerator;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class CanalComunicacionesConverter implements AttributeConverter<CanalComunicacionesEnumerator,String> {
    @Override
    public String convertToDatabaseColumn(CanalComunicacionesEnumerator canalComunicacionesEnumerator) {
        return Optional.ofNullable(canalComunicacionesEnumerator)
                .map(CanalComunicacionesEnumerator::getCode).orElse(null);

    }

    @Override
    public CanalComunicacionesEnumerator convertToEntityAttribute(String code) {
        return Optional.ofNullable(code)
                .map(CanalComunicacionesEnumerator::of).orElse(null);
    }
}
