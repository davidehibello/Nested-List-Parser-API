package com.example.nestedlist.dto;

public class ParseResponse {
    private Object result;

    public ParseResponse(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}