package com.salim.behavioral.mediator.Example;

public class AirBalloon implements Flight {

    private final FlightMediator Mediator;

    public AirBalloon(FlightMediator Mediator)
    {
        this.Mediator = Mediator;
    }

    public void land()
    {
        if (Mediator.isLandingOk())
        {
            System.out.println("Air Balloon successfully Landed.");
            Mediator.setLandingStatus(false);
        }
        else
            System.out.println("Air Balloon waiting for landing.");
    }

    public void getReady()
    {
        System.out.println("Air Balloon ready for landing.");
    }
}
