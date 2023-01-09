package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class TipoDocumentoConverter implements AttributeConverter<TipoDocumentoEnumerator,String> {
    @Override
    public String convertToDatabaseColumn(TipoDocumentoEnumerator tipoDocumentoEnumerator) {
        return Optional.ofNullable(tipoDocumentoEnumerator)
                .map(TipoDocumentoEnumerator::getCode).orElse(null);
    }

    @Override
    public TipoDocumentoEnumerator convertToEntityAttribute(String code) {
        return Optional.ofNullable(code)
                .map(TipoDocumentoEnumerator::of).orElse(null);
    }
}
