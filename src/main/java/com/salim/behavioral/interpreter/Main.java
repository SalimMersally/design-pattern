package com.salim.behavioral.interpreter;

import com.salim.behavioral.interpreter.example.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.addEmployee(new Employee("Salim", 50000, "Manager"));
        context.addEmployee(new Employee("Ahmad", 75000, "Developer"));
        context.addEmployee(new Employee("Lamis", 60000, "Developer"));

        Expression name = new Name("Ahmad");
        Expression salary = new Salary(60000);
        Expression jobTitle = new JobTitle("Manager");

        // (Ahmad and 60000): []
        Expression andExpression = new And(name, salary);
        // (Ahmad and 60000) or Manager: [Salim]
        Expression orExpression = new Or(andExpression, jobTitle);
        // Not [(Ahmad and 60000) or Manager]: [Ahmad, Lamis]
        Expression notExpression = new Not(orExpression);

        List<Employee> result = notExpression.interpret(context.getEmployees());

        System.out.println("Employees who are Not [(Ahmad and 60000) or Manager]:");
        for (Employee employee : result)
            System.out.println(employee);
    }
}
