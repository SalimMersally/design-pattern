package com.salim.structural.facade;

import com.salim.structural.facade.complexsystem.SubSystemA;
import com.salim.structural.facade.complexsystem.SubSystemB;
import com.salim.structural.facade.complexsystem.SubSystemC;

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
