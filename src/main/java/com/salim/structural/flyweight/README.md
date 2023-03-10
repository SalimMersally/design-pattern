# Flyweight

The flyweight design pattern allows you to manage big number of similar objects by sharing the same object. 
<br>
This can help reduce memory usage and improve performance.

## How does a flyweight works?

To design a flyweight we first start by a flyweight factory that contains a pool of all objects that can be shared (This can be whole objects or parts of another objects.)
<br>
When a user wants an object, he doesn't create a new one, but rather he request one from the factory. The factory checks the pool for the object, if it is available, it gives the user a reference to it, otherwise it create a new one and add it to the pool.