# Builder 
## Define: 
The Builder design pattern is a creational design pattern that separates the construction of a complex object from its 
representation. It allows you to create different representations of an object while using the same construction code.

In this pattern, you have a separate builder class that is responsible for creating the object. The builder takes care 
of creating the object step by step, where each step involves the creation of a different part of the object. 
The Main (or client) code, which is responsible for using the builder to create the object, can specify which parts 
to include in the object and in what order.

The Builder design pattern is useful when you have complex objects that are difficult to create in one go. 
By breaking down the construction process into smaller steps, the pattern makes the process more manageable and allows 
you to create different representations of the same object more easily.

One of the advantages of using the Builder pattern is that it can help to reduce the amount of duplicate code that is 
required for creating similar objects. By using the same builder for different objects, you can avoid repeating the same
code for each object and instead reuse the code in the builder.

