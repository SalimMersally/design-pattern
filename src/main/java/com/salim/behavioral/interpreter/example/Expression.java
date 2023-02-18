package com.salim.behavioral.interpreter.example;

import java.util.List;

// Abstract Expression
public interface Expression {
    List<Employee> interpret(List<Employee> employees);
}