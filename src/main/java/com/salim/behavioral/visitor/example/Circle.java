package com.salim.behavioral.visitor.example;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        System.out.println("Running the visitor method on the circle");
        visitor.visitCircle(this);
    }
}

