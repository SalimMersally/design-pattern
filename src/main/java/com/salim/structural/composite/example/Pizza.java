package com.salim.structural.composite.example;

public class Pizza implements Food{

    private double price;

    public Pizza() {
        price = 3.5;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }

    @Override
    public double getPrice() {
        System.out.println("adding Pizza $" + price );
        return price;
    }
}
