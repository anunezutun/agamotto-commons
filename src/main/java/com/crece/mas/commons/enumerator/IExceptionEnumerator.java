package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.MPlusErrorResponse;
import org.springframework.http.HttpStatus;

public interface IExceptionEnumerator {
    String getInternalCode();
    HttpStatus getHttpCode();
    MPlusErrorResponse getErrorResponse();
}
