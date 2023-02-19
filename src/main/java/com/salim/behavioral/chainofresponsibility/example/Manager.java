package com.salim.behavioral.chainofresponsibility.example;

public class Manager implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getRequestType().equals("Raise")) {
            System.out.println("Manager: " + request.getRequestDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for the request.");
        }
    }
}