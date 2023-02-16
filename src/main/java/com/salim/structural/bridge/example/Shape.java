package com.salim.structural.bridge.example;

// Can be an interface
abstract class Shape {
    Design colorMode;

    public Shape(Design colorMode) {
        this.colorMode = colorMode;
    }

    abstract double getSize();
    abstract double getPositionX();
    abstract double getPositionY();
    public void draw() {
        colorMode.fill();
    }
}
