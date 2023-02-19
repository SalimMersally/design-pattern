package com.salim.behavioral.chainofresponsibility;

import com.salim.behavioral.chainofresponsibility.example.*;

public class Main {
    public static void main(String[] args) {
        // Create the ConcreteHandlers
        Handler manager = new Manager();
        Handler director = new Director();
        Handler ceo = new CEO();

        // Set up the chain of responsibility
        manager.setNext(director);
        director.setNext(ceo);

        // Send requests to the chain of responsibility
        manager.handleRequest(new Request("Raise", "Request for a raise."));
        manager.handleRequest(new Request("Vacation", "Request for time off."));
        manager.handleRequest(new Request("Budget", "Request for a budget increase."));
        //Example of no handler found
        //manager.handleRequest(new Request("Loan", "Request for a loan."));
    }
}
/*In this example, we have defined three ConcreteHandlers - Manager, Director, and CEO - each of which can handle a
specific type of request. We have also defined the Handler interface and the Request class.

In the main method of the Client class, we create instances of the ConcreteHandlers and set up the chain of
responsibility by calling the setNext method on each handler. We then send three different requests to the chain of
responsibility by calling the handleRequest method on the first handler in the chain (Manager).

When each request is received, the Manager first tries to handle it. If it can't handle it, the request is passed on to
 the next handler in the chain, and so on until the request is successfully handled or there are no more handlers in
 the chain. The output of the program shows which handler successfully handled each request.
 */