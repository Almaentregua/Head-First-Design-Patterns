# Head First Design Patterns
I am using this repo to save my notes and progress of the book "Head First Design Patterns: A Brain-Friendly Guide" By Eric Freeman, Elisabeth Robson, Kathy Sierra and Bert Bates.
Book material: https://www.wickedlysmart.com/head-first-design-patterns/


##Creational patterns: Provide various object creation mechanisms, which increase flexibility and reuse of existing code.

### The Factory Method: Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

### The Abstract Factory Pattern: Provides an interface for creating families of related or dependent objects without specifying their concrete classes. 
                       
##Structural patterns: Explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

### The Decorator Pattern

Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

##Behavioral patterns: Are concerned with algorithms, and the assignment of responsibilities between objects.

### The Strategy Pattern

Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

### The Observer Pattern

Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and update automatically.


## Design Principles

* Identify the aspects of your application that vary and separate them from what stays the same.

* Program to an interface, not an implementation.

* Favor composition over inheritance.

* Strive for loosely coupled designs between objects that interact.

* Classes should be open for extension, but closed for modification.

* Depend upon abstractions. Do not depend upon concrete classes.