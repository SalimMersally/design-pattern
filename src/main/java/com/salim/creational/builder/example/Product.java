package com.salim.creational.builder.example;

public class Product {
    private final String name;
    private final int size;
    private final String color;
    private final double price;
    private final String category;
    private final String dateOfProduction;

    public Product(String name, int size, String color, double price,
                   String category, String dateOfProduction) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
        this.category = category;
        this.dateOfProduction = dateOfProduction;
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", dateOfProduction='" + dateOfProduction + '\'' +
                '}';
    }
}