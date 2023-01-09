package com.crece.mas.commons.exception;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class MPlusErrorResponse implements Serializable {
    private String code;
    private String message;
}