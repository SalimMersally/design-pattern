package com.salim.structural.bridge.example;

public class Square extends Shape {
    public Square(Design action1, Design action2) {
        super(action1, action2);
    }

    @Override
    public void draw() {
        System.out.println("Square ");
        action1.designAction();
        action2.designAction();
    }
}