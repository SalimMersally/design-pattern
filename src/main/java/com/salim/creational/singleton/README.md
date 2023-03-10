# Singleton
## Define
The Singleton design pattern is a creational design pattern that ensures that only one instance of a class can be 
created, and that it provides a global point of access to that instance. In other words, it restricts the instantiation
of a class to a single object and provides a way to access that object.

This pattern is useful when you need to ensure that there is only one instance of a particular class in the 
system. Examples of when you might want to use the Singleton pattern include:

* When you need to manage a shared resource such as a database connection or a thread pool.
* When you need to limit the number of instances of a class for performance reasons.
* When you want to have a single point of control for a certain feature or functionality in your application.

The Singleton pattern typically involves creating a class with a private constructor, a private static instance
of the class, and a public static method to access that instance. The static method checks if the instance has
already been created, and if it has, it returns the existing instance. If the instance has not been created,
the method creates it and returns it.
