package com.salim.creational.factorymethod.example;

public class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
