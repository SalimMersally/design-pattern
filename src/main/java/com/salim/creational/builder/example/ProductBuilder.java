package com.salim.creational.builder.example;

public class ProductBuilder {
    private String name;
    private int size;
    private String color;

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

    public Product build() {
        return new Product(name, size, color);
    }
}