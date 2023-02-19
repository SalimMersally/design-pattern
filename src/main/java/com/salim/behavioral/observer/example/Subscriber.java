package com.salim.behavioral.observer.example;

public class Subscriber {
    private double rate;
    private String name;
    private String email;

    public Subscriber(String name, String email){
        rate = 0.0;
        this.name = name;
        this.email = email;
    }
    public void update(double rate) {
        this.rate = rate;
        System.out.println("notice for " + name +" dollar rate reached " + rate );
    }


}
