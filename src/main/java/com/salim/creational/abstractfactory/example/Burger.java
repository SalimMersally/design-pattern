package com.salim.creational.abstractfactory.example;

class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing burger");
    }
}
