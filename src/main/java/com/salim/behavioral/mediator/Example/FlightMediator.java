package com.salim.behavioral.mediator.Example;

public interface FlightMediator {
    public void registerRunway(Port port);

    public void registerFlight(Flight flight);

    public boolean isLandingOk();

    public void setLandingStatus(boolean status);
}
