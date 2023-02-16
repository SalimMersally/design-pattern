package com.salim.structural.bridge;

import com.salim.structural.bridge.example.Circle;
import com.salim.structural.bridge.example.Draw;
import com.salim.structural.bridge.example.Square;
import com.salim.structural.bridge.example.Paint;

import java.awt.*;


public class Main {
    public static void main(String[] args)
    {
        Circle shape1 = new Circle(new Draw(12,2), new Paint("yellow"));
        shape1.draw();

        Square shape2 = new Square(new Draw(15,10), new Paint("red"));
        shape2.draw();
    }
}
