package com.salim.structural.composite.example;

public class Burger implements Food{
    private final double price;

    public  Burger() {
        price = 4;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger");
    }

    @Override
    public double getPrice() {
        System.out.println("adding Burger $" + price);
        return price;
    }
}
