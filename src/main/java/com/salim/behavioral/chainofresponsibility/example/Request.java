package com.salim.behavioral.chainofresponsibility.example;

public class Request {
    private String requestType;
    private String requestDescription;

    public Request(String type, String description) {
        requestType = type;
        requestDescription = description;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }
}