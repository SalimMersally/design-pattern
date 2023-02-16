package com.salim.structural.bridge.example;

public class SolidFill implements Design {

    public final String color;

    public SolidFill(String color) {
        this.color = color;
    }

    @Override
    public void fill() {
        System.out.println("Filling Shape with solid color: " + color);
    }
}
