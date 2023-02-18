package com.salim.behavioral.visitor;

import com.salim.behavioral.visitor.example.AreaCalculatorVisitor;
import com.salim.behavioral.visitor.example.Circle;
import com.salim.behavioral.visitor.example.Rectangle;
import com.salim.behavioral.visitor.example.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        Triangle triangle = new Triangle(8.0, 12.0);

        AreaCalculatorVisitor visitor = new AreaCalculatorVisitor();
        circle.accept(visitor);
        rectangle.accept(visitor);
        triangle.accept(visitor);

        double totalArea = visitor.getTotalArea();
        System.out.println("Total area: " + totalArea);
    }
}
