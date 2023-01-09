package com.crece.mas.commons.exception;

public class CreceMasBadRequestException extends RuntimeException {

    public CreceMasBadRequestException(String message) {
        super(message);
    }

    public CreceMasBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
