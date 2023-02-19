package com.salim.behavioral.chainofresponsibility.example;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(Request request);
}