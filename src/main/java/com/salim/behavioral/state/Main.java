package com.salim.behavioral.state;

import com.salim.behavioral.state.example.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        light.printStatus();

        light.nextState();
        light.printStatus();

        light.nextState();
        light.printStatus();

        light.nextState();
        light.printStatus();
    }

}
