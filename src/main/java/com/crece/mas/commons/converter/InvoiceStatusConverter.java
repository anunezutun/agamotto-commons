package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.InvoiceStatusEnumerator;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter(autoApply = true)
public class InvoiceStatusConverter implements AttributeConverter<InvoiceStatusEnumerator,String>{
    @Override
    public String convertToDatabaseColumn(InvoiceStatusEnumerator statusInvoiceEnumerator) {
        return Optional.ofNullable(statusInvoiceEnumerator)
                .map(InvoiceStatusEnumerator::getCode).orElse(null);
    }

    @Override
    public InvoiceStatusEnumerator convertToEntityAttribute(String code) {
        return Optional.ofNullable(code)
                .map(InvoiceStatusEnumerator::of).orElse(null);
    }
}
