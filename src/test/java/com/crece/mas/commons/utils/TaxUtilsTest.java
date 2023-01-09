package com.crece.mas.commons.utils;

import com.crece.mas.commons.enumerator.IGVTypeEnumerator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxUtilsTest {

    @Test
    void calculateTax() {
        List<BigDecimal> amounts = Stream.of(
                BigDecimal.valueOf(7.32).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(6.34).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4.07).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(6.11).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.51).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(1.02).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(1.02).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.79).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(39.95).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(8.33).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(18.54).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(56.75).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4.07).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(14.63).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.55).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4.07).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4.07).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4.07).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.51).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.51).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.01).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.77).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(39.95).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(13.76).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(27.09).setScale(2, RoundingMode.HALF_UP)
        ).collect(Collectors.toList());
        BigDecimal tax = BigDecimal.valueOf(0.18).setScale(2, RoundingMode.HALF_UP);
        List<BigDecimal> expectedResults = Stream.of(
                BigDecimal.valueOf(1.12).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.97).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.62).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.93).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.08).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.16).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.16).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.43).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(6.09).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(1.27).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.83).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(8.66).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.62).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.23).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.54).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.62).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.62).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.62).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.08).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.08).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.46).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.58).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(6.09).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.1).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4.13).setScale(2, RoundingMode.HALF_UP)
        ).collect(Collectors.toList());

        for(int i = 0; i < amounts.size(); i++) {
            assertEquals(TaxUtils.calculateTax(amounts.get(i), tax, IGVTypeEnumerator.INCLUDED), expectedResults.get(i));
        }
    }
}