package com.salim.behavioral.observer.example;

public class Subscriber {
    private double rate;
    private final String name;
    private final String email;

    public Subscriber(String name, String email){
        rate = 0.0;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getRate() {
        return rate;
    }

    public void update(double rate) {
        this.rate = rate;
        System.out.println("Notice for " + name +" dollar rate reached " + rate );
    }


}
