package com.salim.behavioral.state.example;

public interface LightState {

    void next(Light light);
    void prev(Light light);
    void printStatus();
}
