package com.salim.structural.bridge.example;

public class Draw implements Design{

    public double x;
    public double y;

    public Draw (double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void designAction() {
        System.out.println("Drawing Started at position x: "+ x+ " y: "+y);
    }
}
