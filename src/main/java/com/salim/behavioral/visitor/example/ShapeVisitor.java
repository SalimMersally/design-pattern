package com.salim.behavioral.visitor.example;

public interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitTriangle(Triangle triangle);

}

