package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.TipoComprobanteEnumerador;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class TipoComprobanteConverter implements AttributeConverter<TipoComprobanteEnumerador,String>{
    @Override
    public String convertToDatabaseColumn(TipoComprobanteEnumerador tipoComprobanteEnumerador) {
        return Optional.ofNullable(tipoComprobanteEnumerador)
                .map(TipoComprobanteEnumerador::getCode).orElse(null);
    }

    @Override
    public TipoComprobanteEnumerador convertToEntityAttribute(String code) {
        return Optional.ofNullable(code)
                .map(TipoComprobanteEnumerador::of).orElse(null);
    }
}
