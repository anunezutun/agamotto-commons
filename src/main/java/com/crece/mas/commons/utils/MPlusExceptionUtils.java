package com.crece.mas.commons.utils;

import com.crece.mas.commons.enumerator.IExceptionEnumerator;
import com.crece.mas.commons.exception.MPlusApiException;
import com.crece.mas.commons.exception.MPlusErrorResponse;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

public class MPlusExceptionUtils {

    public static ResponseEntity<MPlusErrorResponse> handleKatuException(MPlusApiException e, HttpServletRequest request) {
        IExceptionEnumerator exceptionEnumerator = e.getExceptionEnumerator();
        MPlusErrorResponse errorResponse = SerializationUtils.clone(exceptionEnumerator.getErrorResponse());
        String message = e.getMessageArgs() == null ? errorResponse.getMessage()
                : String.format(errorResponse.getMessage(), e.getMessageArgs());
        errorResponse.setMessage(message);
        return new ResponseEntity<>(errorResponse, e.getExceptionEnumerator().getHttpCode());
    }
}
