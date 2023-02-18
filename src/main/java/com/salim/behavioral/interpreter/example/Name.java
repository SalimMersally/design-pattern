package com.salim.behavioral.interpreter.example;

import java.util.ArrayList;
import java.util.List;

// Terminal Expression
public class Name implements Expression{
    private final String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public List<Employee> interpret(List<Employee> employees) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                result.add(employee);
            }
        }
        return result;
    }
}

