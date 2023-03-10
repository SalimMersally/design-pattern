# Prototype design-pattern
Prototype is a pattern used to copy existing objects without making code dependent on their classes
It prompts the object to copy itself instead of you manually copying it. The steps happen as follows:
        1- A common interface is declared for all and includes 1 method "clone"
        2- Now an object can copy itself including all the private fields it has because most programming languages allow access to other objects that belong to the same class
        3- At this point you can create different clones of the original objects and add some variations. These prototypes can be immediately used later by cloning them.
pros: 
    - independence: no need to refer back to the class to clone
    - shorter: no need for repeated initialization code
    - simpler: you can create complex object more conviniently
    - could be an alernative to inheretence for complicated objects
