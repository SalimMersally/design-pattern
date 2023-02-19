package com.salim.behavioral.state.example;

public class Light {

    private LightState state = new RedLight();

    public void setState(LightState state) {
        this.state = state;
    }

    public void previousState(){

        state.prev(this);
    }
    public void nextState(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }

}
