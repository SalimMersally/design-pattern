package com.salim.creational.abstractfactory.example;

class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza");
    }
}