package com.crece.mas.commons.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsTest {

    @Test
    void isValidEmail() {
        List<String> valid = Arrays.asList(
                "hola.123@gmail.com",
                "hola.123@gmail.com",
                "hola.123@gmail.com",
                "hola.123@gmail.com",
                "hola.123@gmail.com",
                "hola.123@gmail.com",
                "hola.123@gmail.com"
        );
        List<String> invalid = Arrays.asList(
                "hola. 123@gmail.com",
                "hola.123 @gmail.com",
                "hola.123@gmail .com",
                "hola .123@gmailcom",
                "hola.123@gmail ",
                "hola.123@gmail. com",
                "hola.123gmail.com"
        );

        valid.forEach(
                email -> assertTrue(ValidationUtils.isValidEmail(email))
        );
        invalid.forEach(
                email -> assertFalse(ValidationUtils.isValidEmail(email))
        );
    }

    @Test
    void isValidDocumentList() {
        List<String> valid = Arrays.asList(
                "70707070",
                "10101010;70707070",
                "10101010;70707070;71717171"
        );

        List<String> invalid = Arrays.asList(
                "70707070 a",
                "10101010;70707070 a",
                "10101010;70707070 a,71717171"
        );
        valid.forEach(
                email -> assertTrue(ValidationUtils.isValidDocumentList(email))
        );
        invalid.forEach(
                email -> assertFalse(ValidationUtils.isValidDocumentList(email))
        );
    }

    @Test
    void isValidCouponName() {
        List<String> valid = Arrays.asList(
                "Aceite",
                "Aceite2",
                "Navidad"
        );

        List<String> invalid = Arrays.asList(
                "Aceite a",
                "Aceite 2",
                "*Aceite 2",
                "Navideño"
        );
        valid.forEach(
                coupon -> assertTrue(ValidationUtils.isValidCouponName(coupon))
        );
        invalid.forEach(
                coupon -> assertFalse(ValidationUtils.isValidCouponName(coupon))
        );
    }
}