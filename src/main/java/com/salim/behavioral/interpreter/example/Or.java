package com.salim.behavioral.interpreter.example;

import java.util.List;

// Non-terminal Expression
public class Or implements Expression {
    private final Expression left;
    private final Expression right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public List<Employee> interpret(List<Employee> employees) {
        List<Employee> leftResult = left.interpret(employees);
        List<Employee> rightResult = right.interpret(employees);
        leftResult.addAll(rightResult);
        return leftResult;
    }
}
