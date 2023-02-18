package com.salim.behavioral.interpreter.example;

import java.util.ArrayList;
import java.util.List;

// Non-terminal Expression
public class Not implements Expression {
    private final Expression expression;

    public Not(Expression expression) {
        this.expression = expression;
    }

    public List<Employee> interpret(List<Employee> employees) {
        List<Employee> result = new ArrayList<>(employees);
        List<Employee> notResult = expression.interpret(employees);
        result.removeAll(notResult);
        return result;
    }
}
