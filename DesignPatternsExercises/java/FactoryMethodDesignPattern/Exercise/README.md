# Factory Method Design Pattern Exercise in Java

## Description
* Factory Method Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Creates objects without specifying the exact class to create.
* Desired class is chosen at run time.
* Creates object without exposing the creation logic to the client and refer to newly created object using a common
  interface.
* It allows to:
  * Create objects without specifying the exact class of objects that will be created
  * Encapsulate object creation so that all object creation code can be kept at one place
* It is used when program needs to:
  * Define the class of an object at runtime
  * Define the class of an object by passing parameter identifying the type of the device
  * Have the same method, BUT different parameter
  * Define an interface for creating an object, but let subclasses decide which class to instantiate
* Factory Method vs. Abstract Factory Design Pattern:
  * Factory Method is called from inside the class hierarchy (the abstract base class)
  * Whereas the AbstractFactory is used from the outside
  * Factory Method uses inheritance and depends on subclass to instantiate desired object
  * While in the Abstract Factory a class gives the responsibility to instantiate an object to another object via
  composition
* Examples:
  * 3D printer will be fabricating a dozen different kinds of devices:
    * The code needs to be set up so that a device will be constructed when the program calls a single method, and
    passes a single parameter, which identifies the type of device to be constructed

## Run the program
To execute the program from command line, please use the following commands:
```
javac FactoryMethodDesignPattern.java
java FactoryMethodDesignPattern
```

## Exercise
* In this example, Factory Method Design Pattern is created, but incomplete.
* It is used for constructing varies `PostCode` objects based on the given property.
* It may create an object only if validation of the given post code is successful:
  * Each class that implements `PostCode` overrides validation of post code in its own way, since it varies based on the
  country
* Please fill in the `____________________`  blanks to make the program run successfully to follow Factory Method Design
Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `FactoryMethodDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output:

```
Creating instance of USPostCode:
27606
Creating instance of INPostCode:
576222
Creating instance of UKPostCode:
SW15 5PU
```
