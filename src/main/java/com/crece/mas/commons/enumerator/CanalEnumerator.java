package com.crece.mas.commons.enumerator;

public enum CanalEnumerator implements IGenericEnumerator<Integer> {

    WEB(0, "web"),
    MOVIL(1, "movil"),
    CHAT_BOT(2, "chatbot");

    private final int code;
    private final String description;

    CanalEnumerator(int code, String description) {
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
    public Integer getCode() {
        return code;
    }

}