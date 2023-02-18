package com.salim.behavioral.visitor.example;

public class AreaCalculatorVisitor implements ShapeVisitor {
    private double totalArea;

    @Override
    public void visitCircle(Circle circle) {
        double circleArea = Math.PI * Math.pow(circle.getRadius(), 2);
        totalArea += circleArea;
        System.out.println("The area of the circle is: " + circleArea);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double rectangleArea = rectangle.getWidth() * rectangle.getHeight();
        totalArea += rectangleArea;
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        double triangleArea = 0.5 * triangle.getBase() * triangle.getHeight();
        totalArea += triangleArea;
        System.out.println("The area of the triangle is: " + triangleArea);
    }

    public double getTotalArea() {
        return totalArea;
    }
}
