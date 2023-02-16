package com.salim.structural.bridge.example;

public class Circle extends Shape {
    public Circle(Design action1, Design action2) {
        super(action1, action2);
    }

    @Override
    public void draw() {
        System.out.println("Circle ");
        action1.designAction();
        action2.designAction();
    }
}
