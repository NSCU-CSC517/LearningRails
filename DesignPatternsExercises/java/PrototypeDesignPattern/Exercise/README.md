# Prototype Design Pattern Exercise in Java

## Description
* Prototype Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Creates a new object from an existing object:
  * New objects (instances) created by cloning (copying) other objects
* It is closely associated with Abstract Factory.
* It allows:
  * Add any subclass instance of a known super class at runtime
  * Reduce runtime complexity
    * Creates cloned objects instead of creating duplicate objects
  * Reduce the need for creating subclasses
  * Replace code smells such as:
    * A compound `if` that needs to be modified every time a new class is added
    * Testing the class of an object
* It is used when:
  * There are numerous potential classes that program needs to use at runtime
  * Original object is created with a resource such as a data stream that may not be available at the time that a clone
  of the object is needed
  * Original object creation involves significant time commitment
    * Reading data from a database
    * Retrieving data over a network
* Example:
  * Having prototype instance of a complex object, use it to clone it and to have a copy of it.

## Run the program
To execute the program from command line, please use the following command:

```
javac PrototypeDesignPattern.java
java PrototypeDesignPattern
```

## Exercise
* In this example, Prototype factory for cloning `Car` objects is created.
* It specifies the kinds of objects to create using a prototypical instance as an argument, and creates new objects by
copying passed prototype.
* To create a prototype in Java, `Cloneable` class is used most of the time.
* In this example `Cloneable` class is also used to allow `PrototypeFactory` class to clone objects.
* Note that `clonedCar` object has the same properties as the `originalCar`, unless properties are changed.
* Program is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Prototype Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `PrototypeDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Creating Car object...
Cloning Car object...

Original Car:
Model: Toyota
Number of Seats: 4
Engine Volume: 2000 cm^3
Horse Power: 150

Cloned Car:
Model: Honda
Number of Seats: 4
Engine Volume: 2000 cm^3
Horse Power: 150
```
