package com.salim.behavioral.state.example;


public class GreenLight implements LightState{

    @Override
    public void next(Light light) {
        light.setState(new YellowLight());
    }

    @Override
    public void prev(Light light) {
        light.setState(new RedLight());
    }

    @Override
    public void printStatus() {
        System.out.println("Green Light On");

    }
}