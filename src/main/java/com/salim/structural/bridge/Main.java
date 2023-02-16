package com.salim.structural.bridge;

import com.salim.structural.bridge.example.Circle;
import com.salim.structural.bridge.example.GradientFill;
import com.salim.structural.bridge.example.SolidFill;
import com.salim.structural.bridge.example.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12, 11, 1, new SolidFill("yellow"));
        Square square = new Square(5, 6, 3, new GradientFill("white", "black"));

        circle.draw();
        square.draw();
    }
}
