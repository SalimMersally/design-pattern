package com.salim.behavioral.mediator.Example;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements FlightMediator {
    private final List<Flight> flights = new ArrayList<>();
    private Port port;
    public boolean land;

    public void registerRunway(Port port)
    {
        this.port = port;
    }

    public void registerFlight(Flight flight)
    {
        this.flights.add( flight);
    }

    public boolean isLandingOk()
    {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status)
    {
        land = status;
    }
}
