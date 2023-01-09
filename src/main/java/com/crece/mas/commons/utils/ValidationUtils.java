package com.crece.mas.commons.utils;

import com.crece.mas.commons.enumerator.DaysEnumerator;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidationUtils {
    /**
     * Check if field have match with regex provided
     * @param field
     * @param regex
     * @return
     */
    public static boolean isValid(String field, String regex) {
        if(field == null || regex == null)
            return false;
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(field);
        return matcher.matches();
    }
    /**
     * Check if time entered have 00:00:00 format
     * @param time
     * @return
     */
    public static boolean isValidTime(String time) {
        return isValid(time,"([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }

    /**
     * Check if email entered is valid
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email) {
        return isValid(email, "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }
    /**
     * Check if RUC entered is valid
     * @param ruc
     * @return
     */
    public static boolean isValidRuc(String ruc) {
        if (ruc == null) {
            return false;
        }
        final int[] multipliers = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
        final String[] prefixes = {"10", "15", "17", "20"};
        final int length = multipliers.length + 1;

        if (ruc.length() != length) {
            return false;
        }

        boolean isPrefixOk = false;

        for (String prefix : prefixes) {
            if (ruc.substring(0, 2).equals(prefix)) {
                isPrefixOk = true;
                break;
            }
        }

        if (!isPrefixOk) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < multipliers.length; i++) {
            final char section = ruc.charAt(i);

            if (!Character.isDigit(section)) {
                return false;
            }

            sum += Character.getNumericValue(ruc.charAt(i)) * multipliers[i];
        }

        final int rest = sum % length;
        final String response = String.valueOf(length - rest);

        return response.charAt(response.length() - 1) == ruc.charAt(ruc.length() - 1);
    }

    public static boolean isValidPhoneNumber(String phone) {
        return isValid(phone, "^[0-9\\-\\+]{9,15}$");
    }
    public static boolean containsOnlyLetters(String string) {
        return isValid(string, "^[a-zA-Z]*$") && !string.contains("\n");
    }

    public static boolean containsOnlyNumbers(String number) {
        return isValid(number, "^[0-9]*$");
    }

    public static boolean containsOnlyLettersAndSpaces(String string) {
        return isValid(string, "^[a-zA-ZÀ-ÿ\\s]*$") && !string.contains("\n");
    }

    public static boolean isValidStringWithPuntutactionMarks(String string){
        return isValid(string, "^[a-zA-ZÀ-ÿ0-9.,&\\-\\s]*$") && !string.contains("\n");
    }

    public static boolean minNameLength(String name){
        List<String> errors = Arrays.stream(name.split(" "))
                .filter(p-> p.length() < 2 && !p.equals("")).collect(Collectors.toList());

        return errors.size()>0? false:true;
    }

    /**
     * Check if dni is valid
     * @param dni
     * @return
     */
    public static boolean isValidDni(String dni) {
        if(dni == null || dni.isEmpty())
            return false;
        if(dni.length() != 8)
            return false;
        return isValid(dni, "^([0-9]*)$");
    }

    /**
     * Check if passport is valid
     * @param passport
     * @return
     */
    public static boolean isValidPassport(String passport) {
        if(passport == null || passport.isEmpty())
            return  false;

        return passport.length() <= 12 && passport.length() >= 7 && isValid(passport, "^[a-zA-Z0-9]*$");
    }

    public static boolean isValidCedule(String passport) {
        if(passport == null || passport.isEmpty())
            return  false;

        return passport.length() <= 12 && passport.length() >= 7 && isValid(passport, "^[0-9]*$");
    }

    /**
     * Check if field is not null and not empty
     * @param field
     * @return
     */
    public static boolean isNotEmptyField(String field) {
        if(field == null || field.isEmpty())
            return false;
        return true;
    }

    /**
     * Check if day is valid
     * @param day
     * @return
     */
    public static boolean isValidDayOfWeek(String day) {
        if(day == null)
            return false;
        return EnumeratorUtils.findByDescription(DaysEnumerator.values(), day).isPresent();
    }

    /**
     * Check if field lenght is valid
     * @param field
     * @param len
     * @return
     */
    public static boolean isValidLength(String field, int len) {
        if(field == null)
            return false;
        return field.length() <= len;
    }

    /**
     * Check if date is valid
     * @param date
     * @param format
     * @return
     */
    public static boolean isValidDate(String date, String format) {
        if(!isNotEmptyField(date) || !isNotEmptyField(format))
            return false;

        ZoneId zoneId = ZoneId.of("America/Lima");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(format).withZone(zoneId);
        try {
            ZonedDateTime creationDate = LocalDate.parse(date, dateFormatter).atStartOfDay(zoneId);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static String getPatternDate(String date){
        String pattern = "dd/MM/yyyy";
        if(date.matches("^\\d{2}/\\d{2}/\\d{4}$")){
            pattern = "dd/MM/yyyy";
        }else if(date.matches("^\\d{2}/\\d{2}/\\d{2}$")){
            pattern = "dd/MM/yy";
        } else if(date.matches("^\\d{1}/\\d{1}/\\d{2}$")){
            pattern = "d/M/yy";
        }else if(date.matches("^\\d{1}/\\d{1}/\\d{4}$")){
            pattern = "d/M/yyyy";
        }

        return pattern;
    }

    public static boolean isValidComercialName(String name) {
        return isValid(name, "^[a-zA-ZÀ-ÿ0-9.,$,@\\-\\s]*$") && !name.contains("\n");
    }

    public static boolean isValidDocumentList(String documents) {
        return isValid(documents, "^[0-9;]*$");
    }

    public static boolean isValidCouponName(String coupon) {
        return isValid(coupon, "^[A-Za-z0-9]*$");
    }
}
