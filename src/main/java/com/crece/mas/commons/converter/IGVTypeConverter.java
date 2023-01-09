package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.IGVTypeEnumerator;
import com.crece.mas.commons.utils.EnumeratorUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class IGVTypeConverter implements AttributeConverter<IGVTypeEnumerator,Integer> {
    @Override
    public Integer convertToDatabaseColumn(IGVTypeEnumerator igvTypeEnumerator) {
        return Optional.ofNullable(igvTypeEnumerator)
                .map(IGVTypeEnumerator::getCode).orElse(null);
    }

    @Override
    public IGVTypeEnumerator convertToEntityAttribute(Integer code) {
        return ((IGVTypeEnumerator) EnumeratorUtils.findByCode(IGVTypeEnumerator.values(), code).orElse(null));
    }

}