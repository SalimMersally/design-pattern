# Chain of Responsibility 
## Definition
The Chain of Responsibility design pattern is a behavioral design pattern that allows a set of objects to handle
a request or an event in a chain-like structure. It provides a way to decouple the sender of a request from the
receiver, by allowing multiple objects to handle the request in turn until one of them successfully handles it.

In this pattern, each object in the chain has a reference to the next object in the chain, forming a linked list
of objects. When a request is made, the first object in the chain tries to handle it. If it is unable to handle
the request, it passes the request on to the next object in the chain, and so on until the request is successfully
handled or there are no more objects in the chain.

The Chain of Responsibility pattern can be useful in situations where the processing of a request requires the
involvement of multiple objects, and it is not known in advance which object will be able to handle the request.
It can also be used to provide a way to add or remove handlers dynamically at runtime.

## The key participants
The key participants in the Chain of Responsibility pattern are:

1. Handler: defines an interface for handling requests and optionally implements the next handler in the chain.
2. ConcreteHandler: implements the Handler interface and handles the request if it is able to do so, 
   or passes it to the next handler in the chain.
3. Client: initiates requests to the chain of handlers.

By using the Chain of Responsibility pattern, developers can achieve better flexibility and extensibility 
in their code, as well as better maintainability and reusability.