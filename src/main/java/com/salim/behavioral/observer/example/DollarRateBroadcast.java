package com.salim.behavioral.observer.example;

import java.util.ArrayList;
import java.util.List;

public class DollarRateBroadcast {
    private double rate;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addObserver(Subscriber channel) {
        this.subscribers.add(channel);
    }

    public void removeObserver(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void updateRate(double rate) {
        this.rate = rate;
        for (Subscriber subscriber: this.subscribers) {
            subscriber.update(this.rate);
        }
    }
}
