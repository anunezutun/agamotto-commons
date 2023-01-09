package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.RegardEnumerator;
import com.crece.mas.commons.utils.EnumeratorUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class RegardConverter implements AttributeConverter<RegardEnumerator, Integer> {

    @Override
    public Integer convertToDatabaseColumn(RegardEnumerator regardEnumerator) {
        return Optional.ofNullable(regardEnumerator)
                .map(RegardEnumerator::getCode).orElse(null);
    }

    @Override
    public RegardEnumerator convertToEntityAttribute(Integer code) {
        return (RegardEnumerator) EnumeratorUtils.findByCode(RegardEnumerator.values(), code).orElse(null);
    }
}
