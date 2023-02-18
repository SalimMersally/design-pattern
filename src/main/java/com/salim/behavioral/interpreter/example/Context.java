package com.salim.behavioral.interpreter.example;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private final List<Employee> employees;

    public Context() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
