package com.salim.structural.facade.example;

import com.salim.structural.facade.example.complexsystem.SubSystemA;
import com.salim.structural.facade.example.complexsystem.SubSystemB;
import com.salim.structural.facade.example.complexsystem.SubSystemC;

public class Facade {
    private final SubSystemA subSystemA;
    private final SubSystemB subSystemB;
    private final SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void doSomethingComplex() {
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
