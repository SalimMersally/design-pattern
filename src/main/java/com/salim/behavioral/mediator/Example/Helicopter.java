package com.salim.behavioral.mediator.Example;

public class Helicopter implements Flight {
    FlightMediator Mediator;
    public Helicopter(FlightMediator Mediator){
        this.Mediator = Mediator;
    }

    @Override
    public void land() {
        if (Mediator.isLandingOk()) {
            System.out.println("Helicopter successfully Landed.");
            Mediator.setLandingStatus(false);
        }
        else
            System.out.println("Helicopter waiting for landing.");
    }

    @Override
    public void getReady() {
        System.out.println("Helicopter ready for landing.");
    }
}
