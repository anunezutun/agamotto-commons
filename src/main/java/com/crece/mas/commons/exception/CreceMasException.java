package com.crece.mas.commons.exception;

public class CreceMasException extends RuntimeException {

    public CreceMasException(String message) {
        super(message);
    }

    public CreceMasException(String message, Throwable cause) {
        super(message, cause);
    }
}
