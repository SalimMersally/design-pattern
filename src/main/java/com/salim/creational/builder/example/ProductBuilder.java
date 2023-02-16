package com.salim.creational.builder.example;

public class ProductBuilder {
    private String name;
    private int size;
    private String color;
    private double price;
    private String category;
    private String dateOfProduction;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public ProductBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public ProductBuilder setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public Product build() {
        return new Product(name, size, color, price, category, dateOfProduction);
    }
}