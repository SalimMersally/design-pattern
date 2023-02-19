package com.salim.behavioral.mediator.Example;

public class Port {
    private final FlightMediator Mediator;

    public Port(FlightMediator Mediator) {
        this.Mediator = Mediator;
        Mediator.setLandingStatus(true);
    }

    public void land() {
        System.out.println("Landing permission granted.");
        Mediator.setLandingStatus(true);
    }
}
