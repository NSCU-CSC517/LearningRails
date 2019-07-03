# Prototype Design Pattern Exercise in Java

## Description
* Prototype Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Creates a new object from an existing object:
  * New objects (instances) created by cloning (copying) other objects
* It is closely associated with Abstract Factory.
* It allows:
  * Add any subclass instance of a known super class at run time
  * Reduce memory usage
  * Reduce runtime creating cloned objects instead of duplicate objects
  * Reduce the need of creating subclasses
  * Replace code smells such as:
    * A compound `if` that needs to be modified every time a new class is added
    * Testing the class of an object
* It is used when:
  * There are numerous potential classes that program needs use at runtime
  * Original object is created with a resource such as a data stream that may not be available at the time that a clone
  of the object is needed
  * Original object creation involves significant time commitment
    * Reading data from a database
    * Retrieving data over a network
* Example:
  * Creation of N objects for testing purposes
    * Cloned objects still need to behave as original object and have the same properties

## Run the program
To execute the program from command line, please use the following command:

```
javac PrototypeDesignPattern.java
java PrototypeDesignPattern
```

## Exercise
* In this example, PrototypeFactory for cloning `Car` objects is created, but incomplete.
* It specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying
prototype.
* To create a prototype in Java, `Cloneable` class is used most of the time.
* In this example `Cloneable` class is also used the to allow `PrototypeFactory` class to clone objects.
* Note that all `clonedCar` objects will share the same properties as the `baseCar`, unless properties are changed.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Prototype Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `PrototypeDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Creating car object..
Cloning Car object..

Model: Toyota
Number of seats: 4
Engine Volume: 2000 cm^3
Horse Power: 150

Model: Honda
Number of seats: 4
Engine Volume: 2000 cm^3
Horse Power: 150
```