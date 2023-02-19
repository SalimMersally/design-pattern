package com.salim.behavioral.memento;

import com.salim.behavioral.memento.example.History;
import com.salim.behavioral.memento.example.Originator;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        History hist = new History();

        originator.setState("State 1");
        originator.setState("State 2");
        hist.add(originator.saveStateToMemento());

        originator.setState("State 3");
        hist.add(originator.saveStateToMemento());

        originator.setState("State 4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(hist.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(hist.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

}


