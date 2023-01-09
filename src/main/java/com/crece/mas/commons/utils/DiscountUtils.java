package com.crece.mas.commons.utils;

import com.crece.mas.commons.model.SponsorsDescuentos;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DiscountUtils {

    private static final MathContext PRECISION = new MathContext(10);
    private static final int TWO_DECIMALS = 2;

    public static BigDecimal calculateAmount(BigDecimal amount, Integer quantity, BigDecimal discount) {
        return amount.subtract(calculateDiscount(amount, discount))
                .multiply(BigDecimal.valueOf(quantity)).setScale(TWO_DECIMALS, RoundingMode.HALF_UP);
    }

    @NotNull
    public static BigDecimal calculateDiscount(BigDecimal amount, BigDecimal discount) {
        return amount.multiply(discount).divide(BigDecimal.valueOf(100), PRECISION);
    }

    public static BigDecimal calculateAmountWithGlobalDiscount(BigDecimal totalAmountWithDiscount, BigDecimal globalDiscount) {
        return totalAmountWithDiscount
                .multiply(new BigDecimal("1")
                        .subtract(ObjectUtils.defaultIfNull(globalDiscount, new BigDecimal("0")).divide(BigDecimal.valueOf(100L), PRECISION)))
                .setScale(TWO_DECIMALS, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculatePurchaseOrderDiscount(BigDecimal totalAmountWithDiscount, BigDecimal globalDiscount) {
        return totalAmountWithDiscount.subtract(calculateAmountWithGlobalDiscount(totalAmountWithDiscount, globalDiscount));
    }

    public static boolean isDiscountExpired(ZonedDateTime today, SponsorsDescuentos sponsorsDescuento) {
        if (sponsorsDescuento.getSdeFechaInicio() != null && sponsorsDescuento.getSdeFechaFin() != null) {
            ZonedDateTime end = ZonedDateTime.ofInstant(sponsorsDescuento.getSdeFechaFin().toInstant(),
                    ZoneId.of(DateUtils.AMERICA_LIMA));
            today = today.truncatedTo(ChronoUnit.DAYS);

            return today.isAfter(end);
        }
        return false;
    }

    public static BigInteger getPrincipalDiscount(
            BigInteger productDiscountId, BigDecimal productDiscountValue,
            BigInteger brandDiscountId, BigDecimal brandDiscountValue,
            BigInteger subcategoryDiscountId, BigDecimal subcategoryDiscountValue,
            BigInteger categoryDiscountId, BigDecimal categoryDiscountValue
    ) {
        BigInteger idDescuento = null;
        List<BigDecimal> percents;

        productDiscountValue = productDiscountValue == null ? BigDecimal.ZERO : productDiscountValue;
        brandDiscountValue = brandDiscountValue == null ? BigDecimal.ZERO : brandDiscountValue;
        subcategoryDiscountValue = subcategoryDiscountValue == null ? BigDecimal.ZERO : subcategoryDiscountValue;
        categoryDiscountValue = categoryDiscountValue == null ? BigDecimal.ZERO : categoryDiscountValue;

        percents = Arrays.asList(productDiscountValue, brandDiscountValue, subcategoryDiscountValue, categoryDiscountValue);
        BigDecimal maxPercent = percents.stream().max(Comparator.naturalOrder()).get();

        if (!maxPercent.equals(BigDecimal.ZERO)) {
            if (maxPercent.equals(productDiscountValue)) {
                idDescuento = productDiscountId;
            }else if (maxPercent.equals(brandDiscountValue)) {
                idDescuento = brandDiscountId;
            }else if (maxPercent.equals(subcategoryDiscountValue)) {
                idDescuento = subcategoryDiscountId;
            }else if (maxPercent.equals(categoryDiscountValue)) {
                idDescuento = categoryDiscountId;
            }
        }
        return idDescuento;
    }
    public static boolean isDiscountRegistered(ZonedDateTime today, SponsorsDescuentos sponsorsDescuento) {
        if (sponsorsDescuento.getSdeFechaInicio() != null && sponsorsDescuento.getSdeFechaFin() != null) {
            ZonedDateTime start = ZonedDateTime.ofInstant(sponsorsDescuento.getSdeFechaInicio().toInstant(),
                    ZoneId.of(DateUtils.AMERICA_LIMA));

            today = today.truncatedTo(ChronoUnit.DAYS);

            return today.isBefore(start);
        }
        return false;
    }
    public static boolean isActiveDiscount(ZonedDateTime today, SponsorsDescuentos sponsorsDescuentos) {
        return !isDiscountRegistered(today, sponsorsDescuentos) && !isDiscountExpired(today, sponsorsDescuentos);
    }
}
