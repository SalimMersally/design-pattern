package com.salim.structural.bridge.example;

import java.awt.*;

abstract class Shape {

    Design colorMode;
    abstract double getSize();
    abstract double getPositionX();
    abstract double getPositionY();
    abstract public void draw();
}
