package com.crece.mas.commons.exception;

    public class CreceMasNotFoundException extends RuntimeException {

    public CreceMasNotFoundException(String message) {
        super(message);
    }

    public CreceMasNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
