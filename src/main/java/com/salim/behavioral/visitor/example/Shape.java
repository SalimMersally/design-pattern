package com.salim.behavioral.visitor.example;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
