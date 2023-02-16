package com.salim.creational.prototype;


import com.salim.creational.prototype.example.Shape;
import com.salim.creational.prototype.example.ShapeCache;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}