package com.salim.behavioral.interpreter.example;

import java.util.ArrayList;
import java.util.List;

// Terminal Expression
public class JobTitle implements Expression {
    private final String jobTitle;

    public JobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Employee> interpret(List<Employee> employees) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getJobTitle().equals(jobTitle)) {
                result.add(employee);
            }
        }
        return result;
    }
}

