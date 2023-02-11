package com.salim.structural.flyweight;

public class FoodItem {
    private final String name;
    private final double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n\t\tname= '" + name + '\'' +
                "\n\t\tprice= " + price;
    }
}
