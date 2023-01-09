package com.crece.mas.commons.utils;

import com.crece.mas.commons.model.PedidoSponsor;
import com.crece.mas.commons.model.SponsorsDescuentos;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DiscountUtilsTest {
    @Test
    void calculateDiscount() {
        List<BigDecimal> prices = Stream.of(
                BigDecimal.valueOf(21.02).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.19).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(8.13).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(1.91).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.19).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.19).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.19).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.55).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.55).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.14).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.93).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(39.95).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(6.88).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.01).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(8.13).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(3.52).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.19).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.19).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.55).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.55).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0.55).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(2.91).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(39.95).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(8.33).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(9.27).setScale(2, RoundingMode.HALF_UP)
        ).collect(Collectors.toList());
        List<Integer> quantities = Stream.of(
                3,
                2,
                2,
                2,
                2,
                2,
                2,
                1,
                1,
                1,
                1,
                1,
                2,
                10,
                1,
                2,
                2,
                3,
                1,
                2,
                2,
                1,
                1,
                1,
                2
        ).collect(Collectors.toList());
        List<BigDecimal> discounts = Stream.of(
                BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(7).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(4).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP),
                BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP)
        ).collect(Collectors.toList());
        List<BigDecimal> expectedResults = Stream.of(
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
                BigDecimal.valueOf(27.09).setScale(2, RoundingMode.HALF_UP),
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
                BigDecimal.valueOf(18.54).setScale(2, RoundingMode.HALF_UP)
        ).collect(Collectors.toList());

        for(int i = 0; i < prices.size(); i++) {
            assertEquals(DiscountUtils.calculateAmount(prices.get(i), quantities.get(i), discounts.get(i)), expectedResults.get(i));
        }
    }

    @Test
    void isDiscountExpired() {
        ZonedDateTime today = ZonedDateTime.of(2021,10,18,5,20,0,0,DateUtils.LIMA_TIME_ZONE);
        SponsorsDescuentos activeLimit1 = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,15,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,18,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos activeLimit2 = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,18,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,25,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos active = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,15,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,19,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos registerLimit = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,19,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,24,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos register = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,26,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos expired = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,9,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,9,26,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos expiredLimit = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,9,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,17,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();

        assertFalse(DiscountUtils.isDiscountExpired(today, active));
        assertFalse(DiscountUtils.isDiscountExpired(today, activeLimit1));
        assertFalse(DiscountUtils.isDiscountExpired(today, activeLimit2));
        assertFalse(DiscountUtils.isDiscountExpired(today, register));
        assertFalse(DiscountUtils.isDiscountExpired(today, registerLimit));
        assertTrue(DiscountUtils.isDiscountExpired(today, expired));
        assertTrue(DiscountUtils.isDiscountExpired(today, expiredLimit));
    }

    @Test
    void getPrincipalDiscount_product() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(50),
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(2),
                categoryDiscountId, BigDecimal.valueOf(1));

        assertEquals(principalDiscount, productDiscountId);
    }

    @Test
    void getPrincipalDiscount_brand() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(5),
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(2),
                categoryDiscountId, BigDecimal.valueOf(1));

        assertEquals(principalDiscount, brandDiscountId);
    }

    @Test
    void getPrincipalDiscount_subcategory() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(5),
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(20),
                categoryDiscountId, BigDecimal.valueOf(1));

        assertEquals(principalDiscount, subcategoryDiscountId);
    }

    @Test
    void getPrincipalDiscount_category() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, null,
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(2),
                categoryDiscountId, BigDecimal.valueOf(70));

        assertEquals(principalDiscount, categoryDiscountId);
    }

    @Test
    void getPrincipalDiscount_productAndOtherEquals() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(10),
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(2),
                categoryDiscountId, BigDecimal.valueOf(1));

        assertEquals(principalDiscount, productDiscountId);

        principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(10),
                brandDiscountId, null,
                subcategoryDiscountId, BigDecimal.valueOf(10),
                categoryDiscountId, BigDecimal.valueOf(1));

        assertEquals(principalDiscount, productDiscountId);

        principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(10),
                brandDiscountId, null,
                subcategoryDiscountId, BigDecimal.valueOf(2),
                categoryDiscountId, BigDecimal.valueOf(10));

        assertEquals(principalDiscount, productDiscountId);
    }

    @Test
    void getPrincipalDiscount_brandAndOthersEquals() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, null,
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(10),
                categoryDiscountId, BigDecimal.valueOf(1));

        assertEquals(principalDiscount, brandDiscountId);

        principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, BigDecimal.valueOf(10),
                brandDiscountId, BigDecimal.valueOf(30),
                subcategoryDiscountId, BigDecimal.valueOf(1),
                categoryDiscountId, BigDecimal.valueOf(30));

        assertEquals(principalDiscount, brandDiscountId);
    }

    @Test
    void getPrincipalDiscount_subcategoryAndOthersEquals() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, null,
                brandDiscountId, BigDecimal.valueOf(10),
                subcategoryDiscountId, BigDecimal.valueOf(30),
                categoryDiscountId, BigDecimal.valueOf(30));

        assertEquals(principalDiscount, subcategoryDiscountId);
    }

    @Test
    void getPrincipalDiscount_null() {
        BigInteger productDiscountId = BigInteger.valueOf(1);
        BigInteger brandDiscountId = BigInteger.valueOf(2);
        BigInteger subcategoryDiscountId = BigInteger.valueOf(3);
        BigInteger categoryDiscountId = BigInteger.valueOf(4);

        BigInteger principalDiscount = DiscountUtils.getPrincipalDiscount(
                productDiscountId, null,
                brandDiscountId, null,
                subcategoryDiscountId, BigDecimal.ZERO,
                categoryDiscountId, BigDecimal.ZERO);

        assertNull(principalDiscount);
    }

    @Test
    void calculateAmountWithGlobalDiscount() {
        List<BigDecimal> amountsWithoutDiscount = Stream.of(
                BigDecimal.valueOf(1874.56),
                BigDecimal.valueOf(895.76),
                BigDecimal.valueOf(1391.76),
                BigDecimal.valueOf(1511.76),
                BigDecimal.valueOf(1287.76)
        ).collect(Collectors.toList());
        List<BigDecimal> discounts = Stream.of(
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(32),
                BigDecimal.valueOf(15),
                BigDecimal.valueOf(0),
                BigDecimal.valueOf(1)
        ).collect(Collectors.toList());
        List<BigDecimal> expectedResults = Stream.of(
                BigDecimal.valueOf(1780.83),
                BigDecimal.valueOf(609.12),
                new BigDecimal("1183.00"),
                BigDecimal.valueOf(1511.76),
                BigDecimal.valueOf(1274.88)
        ).collect(Collectors.toList());

        for (int i = 0; i < amountsWithoutDiscount.size(); i++) {
            assertEquals(expectedResults.get(i), DiscountUtils.calculateAmountWithGlobalDiscount(amountsWithoutDiscount.get(i), discounts.get(i)));
        }
    }

    @Test
    void calculatePurchaseOrderDiscount() {
        List<BigDecimal> amountsWithoutDiscount = Stream.of(
                BigDecimal.valueOf(1874.56),
                BigDecimal.valueOf(895.76),
                BigDecimal.valueOf(1391.76),
                BigDecimal.valueOf(1511.76),
                BigDecimal.valueOf(1287.76)
        ).collect(Collectors.toList());
        List<BigDecimal> discounts = Stream.of(
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(32),
                BigDecimal.valueOf(15),
                BigDecimal.valueOf(0),
                BigDecimal.valueOf(1)
        ).collect(Collectors.toList());
        List<BigDecimal> expectedResults = Stream.of(
                BigDecimal.valueOf(93.73),
                BigDecimal.valueOf(286.64),
                BigDecimal.valueOf(208.76),
                new BigDecimal("0.00"),
                BigDecimal.valueOf(12.88)
        ).collect(Collectors.toList());

        for (int i = 0; i < amountsWithoutDiscount.size(); i++) {
            assertEquals(expectedResults.get(i), DiscountUtils.calculatePurchaseOrderDiscount(amountsWithoutDiscount.get(i), discounts.get(i)));
        }
    }

    @Test
    void isDiscountRegistered() {
        ZonedDateTime today = ZonedDateTime.of(2021,10,18,5,20,0,0,DateUtils.LIMA_TIME_ZONE);
        SponsorsDescuentos activeLimit1 = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,15,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,18,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos activeLimit2 = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,18,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,25,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos active = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,15,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,19,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos registerLimit = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,19,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,24,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos register = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,26,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos expired = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,9,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,9,26,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos expiredLimit = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,9,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,17,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();

        assertFalse(DiscountUtils.isDiscountRegistered(today, active));
        assertFalse(DiscountUtils.isDiscountRegistered(today, activeLimit1));
        assertFalse(DiscountUtils.isDiscountRegistered(today, activeLimit2));
        assertTrue(DiscountUtils.isDiscountRegistered(today, register));
        assertTrue(DiscountUtils.isDiscountRegistered(today, registerLimit));
        assertFalse(DiscountUtils.isDiscountRegistered(today, expired));
        assertFalse(DiscountUtils.isDiscountRegistered(today, expiredLimit));
    }

    @Test
    void isDiscountActived() {
        ZonedDateTime today = ZonedDateTime.of(2021,10,18,5,20,0,0,DateUtils.LIMA_TIME_ZONE);
        SponsorsDescuentos activeLimit1 = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,15,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,18,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos activeLimit2 = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,18,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,25,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos active = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,15,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,19,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos registerLimit = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,19,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,24,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos register = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,10,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,26,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos expired = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,9,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,9,26,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();
        SponsorsDescuentos expiredLimit = SponsorsDescuentos.builder()
                .sdeFechaInicio(Date.from(ZonedDateTime.of(2021,9,20,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .sdeFechaFin(Date.from(ZonedDateTime.of(2021,10,17,0,0,0,0,DateUtils.LIMA_TIME_ZONE).toInstant()))
                .build();

        assertTrue(DiscountUtils.isActiveDiscount(today, active));
        assertTrue(DiscountUtils.isActiveDiscount(today, activeLimit1));
        assertTrue(DiscountUtils.isActiveDiscount(today, activeLimit2));
        assertFalse(DiscountUtils.isActiveDiscount(today, register));
        assertFalse(DiscountUtils.isActiveDiscount(today, registerLimit));
        assertFalse(DiscountUtils.isActiveDiscount(today, expired));
        assertFalse(DiscountUtils.isActiveDiscount(today, expiredLimit));
    }
}