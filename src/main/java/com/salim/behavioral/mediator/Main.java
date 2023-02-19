package com.salim.behavioral.mediator;

import com.salim.behavioral.mediator.Example.*;

public class Main {
    public static void main(String[] args) {


        ControlTower newYorkAirways = new ControlTower();

        Airplane sparrow101 = new Airplane(newYorkAirways);
        Helicopter cc600 = new Helicopter(newYorkAirways);
        AirBalloon Dream100 = new AirBalloon(newYorkAirways);

        Port mainLanding = new Port(newYorkAirways);

        newYorkAirways.registerFlight(sparrow101);
        newYorkAirways.registerFlight(cc600);
        newYorkAirways.registerFlight(Dream100);
        newYorkAirways.registerRunway(mainLanding);

        sparrow101.getReady();
        mainLanding.land();
        sparrow101.land();

        cc600.land();

        mainLanding.land();
        cc600.land();

    }
}
