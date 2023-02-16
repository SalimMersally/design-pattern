package com.salim.structural.bridge.example;

public class Square extends Shape {

    private double side;
    private double x;
    private double y;

    private Design designMode;
    public Square(double x, double y, double s, Design designMode) {
        this.x = x;
        this.y = y;
        this.side = s;
        this.designMode = designMode;
    }

    @Override
    double getSize() {
        return side*side;
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
        System.out.println("Drawing Square of size "+ getSize()+" and position ("+getPositionX()+ ","+ getPositionY()+")");
        designMode.fill();
    }
}