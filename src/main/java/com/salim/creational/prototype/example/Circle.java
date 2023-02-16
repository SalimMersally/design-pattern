package com.salim.creational.prototype.example;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle's draw() method.");
    }
}