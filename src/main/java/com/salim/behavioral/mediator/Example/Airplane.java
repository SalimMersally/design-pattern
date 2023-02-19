package com.salim.behavioral.mediator.Example;

public class Airplane implements Flight{
    private final FlightMediator Mediator;

    public Airplane(FlightMediator Mediator){
        this.Mediator = Mediator;
    }

    @Override
    public void land() {
        if (Mediator.isLandingOk()) {
            System.out.println("Airplane successfully Landed.");
            Mediator.setLandingStatus(false);
        }
        else
            System.out.println("Airplane waiting for landing.");
    }

    @Override
    public void getReady() {
        System.out.println("Airplane ready for landing.");

    }
}
