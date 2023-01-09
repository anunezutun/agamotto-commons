package com.crece.mas.commons.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MPlusListUtils {

	public static List<String> getFromStringsSeparatedByComma(String value) {
		return StringUtils.isNotEmpty(value) ? Arrays.asList(value.split(","))
			: Collections.emptyList();
	}
	
    public static BigDecimal validateAndRound2Digist(BigDecimal value) {
        return value = (value == null) ? null : value.setScale(2, RoundingMode.CEILING);
    }

    public static BigDecimal validaValZero(BigDecimal value) {
    	if (value == null) {
			return null;
		}else if (value.signum() == 0) {
            return BigDecimal.ZERO;
        } else {
            return value;
        }
    }
    
    public static BigDecimal roundNumberTo2Digits(BigDecimal value) {
    	if (value == null) {
    		return null;
		}else if (value.toString().contains(".")) {
    		return (value.toString().contains(".00")) ? value.setScale(0, RoundingMode.HALF_UP) : value.setScale(2, RoundingMode.HALF_UP);
    	}else {
    		return (value.signum() == 0) ? BigDecimal.ZERO : value;
    	}
    }
    
	public static boolean verifyNumberOverflowed(BigDecimal bigNumber, int entero, int decimal ) {
		if (bigNumber == null ) {
    		return false;
		}else if (bigNumber.toString().contains(".")) {
			String[] splitNumber = bigNumber.toString().split("\\.");
			if (splitNumber[0].length() > entero || splitNumber[1].length() > decimal) {
				return false;
	        }
		}else if (bigNumber.toString().length() > entero) {
			return false;
		}
		return true;
	}

}
