package com.crece.mas.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
public class CrecemasErrorResponse implements Serializable {
    private long timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
