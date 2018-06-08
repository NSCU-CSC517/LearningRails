# Liskov Substitution Principle

## Overview of principle
* "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it."
In short, if X is a Y, it should be able to do everything a Y can do. Any time you replace a Y with an X, there should not be any unexpected side effects. For example, a Square is a Rectangle, but making Square a subclass of Rectangle would make Rectangle's setWidth() and setHeight() methods behave strangely (as a square would have to set both for either method).

## "Bad" Example
This example is very similar to the square-rectangle example. In this case, an Ostrich is a subclass of Bird. Bird is an abstract class with, among other things, a flyTo(height) method. However, since an Ostrich can't fly, it does not behave as expected, and is forced to throw an UnsupportedOperationException on what should be a core feature of a Bird.
