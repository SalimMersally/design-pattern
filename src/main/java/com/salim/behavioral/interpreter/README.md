# Interpreter

The Interpreter design pattern is a behavioral design pattern that defines a way to evaluate and execute a language or a set of rules. It is used to interpret and execute a particular language or syntax. The Interpreter pattern is used to create an interpreter that can evaluate the language or syntax of a given problem domain and perform operations based on it.

The Interpreter pattern is useful when we need to implement a language or syntax for a specific problem domain. It can be used to evaluate simple or complex expressions and provide an interface for users to enter commands in the language. The Interpreter pattern can also be used to create a scripting language for a particular application.

## How does the interpreter works?
1. Abstract Expression: This component defines an abstract syntax tree for the language to be interpreted. It provides an interface for all the concrete expression classes to implement.
2. Terminal Expression: This component represents a single expression of the language. It implements the Abstract Expression interface. 
3. Non-terminal Expression: This component represents a composite expression that can have one or more sub-expressions. It also implements the Abstract Expression interface. 
4. Context: This component contains the information that needs to be interpreted. It provides the context for the interpretation. 

## When do we need an interpreter?
* Creating a query language for a database system.
* Implementing a calculator that can evaluate complex mathematical expressions.
* Creating a scripting language for an application to perform various tasks.
* Implementing a rule engine to evaluate and execute a set of rules.

## Example
![Interpreter UML diagram](interpreterUMLDiagram.png)