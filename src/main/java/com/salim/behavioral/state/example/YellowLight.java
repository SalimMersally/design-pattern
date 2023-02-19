package com.salim.behavioral.state.example;

public class YellowLight implements LightState{

    @Override
    public void next(Light light) {
        light.setState(new RedLight());
    }

    @Override
    public void prev(Light light) {
        light.setState(new GreenLight());
    }

    @Override
    public void printStatus() {
        System.out.println("Yellow Light On");
    }
}