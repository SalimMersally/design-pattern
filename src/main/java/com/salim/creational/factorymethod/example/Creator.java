package com.salim.creational.factorymethod.example;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        product.operation();
    }
}
