# Facade

The facade pattern provides a simplified interface to interact with a complex system.
<br>
It usually act as an intermediary between a complex system (such as a 3rd party library or a framework) and the client. The purpose is to provide a set of simple methods that interact with the complex system in a simple manner.
<br>
Using a facade helps us to specify a set of functionality needed from a complex system and provide an easy way to call them instead of using the complex system directly.
<br>
The facade improve the code readability, and reduce the coupling between the complex system and the client (since only the facade is connected to it).