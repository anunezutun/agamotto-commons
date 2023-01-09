package com.crece.mas.commons.exception;

import com.crece.mas.commons.enumerator.IExceptionEnumerator;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MPlusApiException extends RuntimeException {
    protected IExceptionEnumerator exceptionEnumerator;
    protected Object[] messageArgs = null;

    public MPlusApiException(IExceptionEnumerator exceptionEnumerator) {
        this.exceptionEnumerator = exceptionEnumerator;
    }

    public MPlusApiException(IExceptionEnumerator exceptionEnumerator, Object... messageArgs) {
        super(String.format(exceptionEnumerator.getErrorResponse().getMessage(), messageArgs));
        this.exceptionEnumerator = exceptionEnumerator;
        this.messageArgs = messageArgs;
    }
}
