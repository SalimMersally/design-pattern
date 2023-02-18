package com.salim.behavioral.interpreter.example;

import java.util.ArrayList;
import java.util.List;

// Terminal Expression
public class Salary implements Expression {
    private final int salary;

    public Salary(int salary) {
        this.salary = salary;
    }

    @Override
    public List<Employee> interpret(List<Employee> employees) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() == salary) {
                result.add(employee);
            }
        }
        return result;
    }
}

