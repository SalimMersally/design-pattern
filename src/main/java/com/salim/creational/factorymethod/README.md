# Factory Method
# define:
Factory Method is a creational design pattern that provides an interface for creating objects 
in a superclass, 
but  allows subclasses to alter the type of objects that will be created.


## Definition: 
It is a creational design pattern that talks about the creation of an object. 
The factory design pattern says that define an interface ( A java interface or an abstract class) 
for creating object and let the subclasses decide which class to instantiate. 
The factory method in the interface lets a class defers the instantiation to one or more concrete subclasses.
Since these design patterns talk about the instantiation of an object and 
so it comes under the category of creational design pattern. 
If we notice the name Factory method, that means there is a method which is a factory, and in general, 
factories are involved with creational stuff and here with this, an object is being created. 
It is one of the best ways to create an object where object creation logic is hidden from the client. 
## Another definition
The Factory Method pattern is a creational design pattern used in object-oriented programming that provides an interface
for creating objects in a super class, but allows subclasses to alter the type of objects that will be created.

In this pattern, a factory method is defined in a base class, which returns an object of a specified type.
The actual implementation of the factory method is left to the subclasses, which can provide their own
implementation of the method to return different types of objects.
This allows the client code to use the factory method to create objects without knowing the specific class of
the object that will be created.

The main advantage of the Factory Method pattern is that it provides a way to create objects without tightly
coupling the client code to the concrete implementation of the object. This makes the code more flexible,
easier to maintain, and easier to extend.

The Factory Method pattern is commonly used in frameworks, libraries, and other large-scale software systems
to provide a standard way of creating objects while allowing for customization and flexibility.
# Implementation:

1. Define a factory method inside an interface.
2. Let the subclass implements the above factory method and decides which object to create.
3. In Java, constructors are not polymorphic, but by allowing subclass to create an object, 
we are adding polymorphic behavior to the instantiation. 
In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide what to create,
and so this Factory method is also called a virtual constructor.



