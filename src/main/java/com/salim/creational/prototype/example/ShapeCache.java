package com.salim.creational.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static final Map <String, Shape> shapeMap = new HashMap <>();

    public static Shape getShape(String shapeId) {
        Shape shapeToBeCloned = shapeMap.get(shapeId);
        return (Shape) shapeToBeCloned.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

    }
}
