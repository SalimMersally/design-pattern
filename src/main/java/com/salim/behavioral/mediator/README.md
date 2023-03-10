# mediator design-pattern

Mediator is a design pattern that reduces chaotic dependencies between objects.

A simple example of the Mediator pattern is the way aircraft pilots communicate through a control tower.

## How does the mediator works?
1. Create several components all having reference to a mediator.
2. The Mediator declares the method of communication between components (usually through a simple notify method).
3. Components do not necessary know of other components, they just notify mediator, and it decides what other components should be triggered.

## Example
![Mediator UML diagram](MediatorUMLDiagram.png)