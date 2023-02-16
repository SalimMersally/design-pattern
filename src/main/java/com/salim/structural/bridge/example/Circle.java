package com.salim.structural.bridge.example;

public class Circle extends Shape {
    private final double radius;
    private final double x;
    private final double y;

    public  Circle(double x, double y ,double radius, Design designMode) {
        super(designMode);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return 3.14 * radius * 2;
    }

    @Override
    public double getPositionX() {
        return x;
    }

    @Override
    public double getPositionY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of size "
                + getSize() + " and position ("
                + getPositionX() + ", "
                + getPositionY() + ") ");
        super.draw();
    }
}
