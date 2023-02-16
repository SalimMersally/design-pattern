package com.salim.structural.bridge.example;

public class Square extends Shape {
    private final double side;
    private final double x;
    private final double y;

    public Square(double x, double y, double s, Design designMode) {
        super(designMode);
        this.x = x;
        this.y = y;
        this.side = s;
    }

    @Override
    public double getSize() {
        return side*side;
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
        System.out.println("Drawing Square of size "
                + getSize() + " and position ("
                + getPositionX() + ", "
                + getPositionY() + ")");
        super.draw();
    }
}