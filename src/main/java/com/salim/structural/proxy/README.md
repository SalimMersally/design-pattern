# Proxy
A proxy provide a placeholder or substitute for another object and acts as an intermediary between the client and the target object.
<br>
A proxy let you control access to an object, and allow you to perform some tasks before or after the request to the original object.

## How a proxy work?
We start off by an interface with a real implementation that do the required job. Then, we create a proxy class that implement the same interface and uses the real class, but we add all the logic we want to run before or after the call to the real implementation

## Example

![Proxy example UML diagram](ProxyUMLDiagram.png)
