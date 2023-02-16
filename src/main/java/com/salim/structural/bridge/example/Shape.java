package com.salim.structural.bridge.example;

import java.awt.*;

abstract class Shape {
    protected Design action1 ;
    protected Design action2;

    protected Shape(Design action1, Design action2)
    {
        this.action1=action1;
        this.action2 = action2;
    }

    abstract public void draw();
}
