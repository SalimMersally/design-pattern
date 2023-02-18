package com.salim.behavioral.interpreter.example;

import java.util.List;

// Non-terminal Expression
public class And implements Expression {
    private final Expression left;
    private final Expression right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public List<Employee> interpret(List<Employee> employees) {
        List<Employee> leftResult = left.interpret(employees);
        List<Employee> rightResult = right.interpret(employees);
        leftResult.retainAll(rightResult);
        return leftResult;
    }
}
