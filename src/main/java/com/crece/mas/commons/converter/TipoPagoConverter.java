package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.TipoPagoEnumerator;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class TipoPagoConverter implements AttributeConverter<TipoPagoEnumerator,String> {
    @Override
    public String convertToDatabaseColumn(TipoPagoEnumerator tipoPagoEnumerator) {
        return Optional.ofNullable(tipoPagoEnumerator)
                .map(TipoPagoEnumerator::getCode).orElse(null);
    }

    @Override
    public TipoPagoEnumerator convertToEntityAttribute(String code) {
        return Optional.ofNullable(code)
                .map(TipoPagoEnumerator::of).orElse(null);
    }
}
