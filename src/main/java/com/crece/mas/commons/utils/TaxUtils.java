package com.crece.mas.commons.utils;

import com.crece.mas.commons.enumerator.IGVTypeEnumerator;

import java.math.BigDecimal;
import java.math.MathContext;

public class TaxUtils {
    public static BigDecimal calculateTax(BigDecimal amount, BigDecimal tax, IGVTypeEnumerator type) {
        MathContext precision = new MathContext(10);
        return type.equals(IGVTypeEnumerator.EXONERATED) ? BigDecimal.ZERO :
                amount
                .multiply(tax.setScale(2, BigDecimal.ROUND_HALF_UP)).divide(tax.add(BigDecimal.ONE)
                .setScale(2, BigDecimal.ROUND_HALF_UP), precision)
                .setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
