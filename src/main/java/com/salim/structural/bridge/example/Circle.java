package com.salim.structural.bridge.example;

public class Circle extends Shape {

    private double radius;
    private double x;
    private double y;

    private Design designMode;

    public  Circle(double x, double y ,double radius, Design designMode) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.designMode = designMode;
    }


    @Override
    double getSize() {
        return 3.14*radius*2;
    }

    @Override
    double getPositionX() {
        return x;
    }

    @Override
    double getPositionY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of size "+ getSize()+" and position ("+getPositionX()+ ","+ getPositionY()+") ");
        designMode.fill();
    }
}
