package com.salim.structural.bridge.example;

public class GradientFill implements Design{

    private String color1;
    private String color2;

    public GradientFill(String color1, String color2) {
        this.color1 = color1;
        this.color2 = color2;
    }


    @Override
    public void fill() {
        System.out.println("Filling Shape with gradient color starting from "+ color1+" to "+color2);
    }
}
