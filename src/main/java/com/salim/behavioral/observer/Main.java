package com.salim.behavioral.observer;

import com.salim.behavioral.observer.example.DollarRateBroadcast;
import com.salim.behavioral.observer.example.Subscriber;

public class Main {
    public static void main (String[] args){
        Subscriber sub1 = new Subscriber("Foad", "faad@lau.edu");
        Subscriber sub2 = new Subscriber("Lisa", "lisa001@gmail.com");

        DollarRateBroadcast broadcast = new DollarRateBroadcast();
        broadcast.addObserver(sub1);
        broadcast.addObserver(sub2);

        broadcast.updateRate(80000);


    }
}
