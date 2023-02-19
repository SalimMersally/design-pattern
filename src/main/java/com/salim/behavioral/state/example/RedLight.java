package com.salim.behavioral.state.example;

public class RedLight implements LightState{

    @Override
    public void next(Light light) {
        light.setState(new GreenLight());
    }

    @Override
    public void prev(Light light) {
        light.setState(new YellowLight());
    }

    @Override
    public void printStatus() {
        System.out.println("Red Light On");
    }
}
