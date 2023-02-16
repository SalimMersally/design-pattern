package com.salim.creational.factorymethod.example;

public class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
