package com.salim.structural.bridge.example;

public class Paint implements Design{

    private String color;

    public Paint(String color) {
        this.color = color;
    }

    @Override
    public void designAction() {
        System.out.println("painting "+ color);
    }
}
