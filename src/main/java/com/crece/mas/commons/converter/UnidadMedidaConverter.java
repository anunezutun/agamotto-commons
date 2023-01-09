package com.crece.mas.commons.converter;
import com.crece.mas.commons.enumerator.UnidadMedidaEnumerador;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class UnidadMedidaConverter implements AttributeConverter<UnidadMedidaEnumerador,String> {
    @Override
    public String convertToDatabaseColumn(UnidadMedidaEnumerador unidadMedidaEnumerador) {
        return Optional.ofNullable(unidadMedidaEnumerador)
                .map(UnidadMedidaEnumerador::getCode).orElse(null);
    }

    @Override
    public UnidadMedidaEnumerador convertToEntityAttribute(String code) {
        return toEntityAttribute(code);
    }
    
    public static UnidadMedidaEnumerador toEntityAttribute(String code){
        return Optional.ofNullable(code)
                .map(UnidadMedidaEnumerador::of).orElse(null);
    }
}
