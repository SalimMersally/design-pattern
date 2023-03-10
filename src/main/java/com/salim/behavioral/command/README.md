# Command
## Definition
The Command design pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing you
to parameterize clients with different requests, queue or log requests, and support undoable operations. 
It is often used in situations where you need to decouple an object making a request from the object 
that performs the request.

## Main Components
The pattern involves four main components:

1. Command: an interface or abstract class that declares a method for executing a command.
2. Concrete Command: an implementation of the Command interface that binds a receiver with an action, and may also 
store additional state for the command.
3. Receiver: the object that performs the action associated with a command.
4. Invoker: the object that triggers the execution of a command, which may also maintain a history of executed commands.

The pattern allows clients to pass commands to an invoker object without having to know the specifics of how 
the command is executed or who is performing the action. The invoker simply invokes the command, which is responsible 
for invoking the appropriate action on the receiver object.

One advantage of the Command design pattern is that it can support undo and redo operations by storing a history of 
executed commands. This makes it useful for implementing features like undoable text editing, where users can undo or 
redo previous changes to a document.

## example real life
The paper order serves as a command. It remains in a queue until the chef is ready to serve it. 
The order contains all the relevant information required to cook the meal. 
It allows the chef to start cooking right away instead of running around clarifying the order details from you directly.
