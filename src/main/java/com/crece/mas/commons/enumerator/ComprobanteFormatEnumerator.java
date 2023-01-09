package com.crece.mas.commons.enumerator;

public enum ComprobanteFormatEnumerator implements IGenericEnumerator<String> {

    PDF("PDF", "pdf"),
    XML("XML", "xml"),
    HASH("HASH", "hash"),
    CDR("CDR", "cdr"),
    QRCODE("QRCODE", "qrcode");

    private final String code;
    private final String description;

    ComprobanteFormatEnumerator(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnumerator{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCode() {
        return code;
    }

}