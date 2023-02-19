package com.salim.behavioral.command;

import com.salim.behavioral.command.example.Command;
import com.salim.behavioral.command.example.ConcreteCommand;
import com.salim.behavioral.command.example.Invoker;
import com.salim.behavioral.command.example.Receiver;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
/* we have a Command interface that defines a single method execute(). We also have a ConcreteCommand class that
implements the Command interface and takes a Receiver object as a parameter.
The execute() method of ConcreteCommand invokes the action() method on the Receiver.

The Receiver class simply defines an action() method that prints a message to the console.

The Invoker class maintains a reference to a Command object and provides methods for
setting the command and executing it.

Finally, in the Client code, we create a Receiver, ConcreteCommand, and Invoker object.
We set the command on the invoker, and then execute the command. When the ConcreteCommand object's execute()
method is called, it invokes the Receiver object's action() method, which prints a message to the console.

Note that this is a very basic example, and in real-world applications the pattern can be much more complex and involve
 multiple commands, receivers, and invokers.
 */