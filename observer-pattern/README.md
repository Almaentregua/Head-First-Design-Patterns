## The Observer Pattern

Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and update automatically.

## Design Principles

* Identify the aspects of your application that vary and separate them from what stays the same.
* Program to an interface, not an implementation.
* Favor composition over inheritance.
* Strive for loosely coupled designs between objects that interact.

## Bullet points
* Subjects, or as we also know them, Observables, update Observers using a common interface.
* You can push or pull data from the Observable when using the pattern (pull is considered more "correct").
* Don't depend on a specific order of notification for your Observers.
* Java has several implementations of the Observer pattern, including the general purpose java.util.Observable.
* Watch out for issues with the java.util.Observable implementation.
* Don't be afraid of create your own Observable implementation if needed.