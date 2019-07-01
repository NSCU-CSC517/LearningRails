# Abstract Factory Design Pattern Exercise in Java

## Description
* Abstract Factory Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Provides an interface to create objects from a family of related or dependent classes without specifying their
concrete classes.
* It allows:
  * Creation of objects without specifying their concrete type
  * Creation of objects without knowing in advance the exact class/type of objects that need to be created
* It is very similar to a Factory Method Design Pattern, but... everything is encapsulated:
  * The method that orders the object
  * The factories that build the object
  * The final objects
  * The final objects contain objects that use the Strategy Pattern
    * Composition: Object class fields are objects  
* It is used when the same criteria applies as for Factory Method Design Patter, but with additional conditions:
  * There is more than 1 (one) set of objects
  * There is multiple objects' hierarchies
    * Factory Design Pattern is not appropriate
  * Factory Method is called from inside the class hierarchy (the abstract base class), whereas the Abstract Factory is
  used from the outside
  * Factory Method uses inheritance and depends on subclass to instantiate desired object, while in the Abstract Factory
  a class gives the responsibility to instantiate an object to another object via composition
  * Abstract Factory Design Pattern often uses `clone()` Java keyword to clone objects
  - In Template Method, they are going to be called in a specific order
* Examples:
  * Design and implementation of a Web Interface for both computers and mobile devices:
    * Appropriate interfaces for the underlying platform should be created, depending upon the type of the device, when
    the web app visits a new page
  * FixedStack class

## Run the program
To execute the program from command line, please run the following commands:
```
javac AbstractFactoryDesignPattern.java
java AbstractFactoryDesignPattern
```

## Exercise
* In this example, Abstract Factory for different countries' phone numbers and postal code is created, but incomplete.
* Upon running the program, it should determine correct abstract factory.
* Once correct abstract factory is created, it instantiates `PhoneNumber` instance or `PostCode` instance.
* Upon creation of `PhoneNumber` and `PostCode` instances, it retrieves phone number or postal code.
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Abstract Factory
Design Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `AbstractFactoryDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
+44 7836 191 191
(919) 515-2011
SW15 5PU
27606
```
