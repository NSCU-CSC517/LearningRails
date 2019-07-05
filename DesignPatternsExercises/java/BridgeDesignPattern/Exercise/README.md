# Bridge Design Pattern Exercise in Java

## Description
* Bridge Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Decouples an abstraction from its implementation so that the two can vary independently.
* Decouples a set of implementations from set of objects using them.
* Progressively adding functionality while separating out major differences using abstract classes.
* It allows to:
  * Cut down on the number of methods that are required to tor the two hierarchies together:
    * `n + m` instead of `n*m`
* It is used when:
  * Requirement is to build a group of classes that slowly added functionality from one class to the next
  * There are two and more hierarchies of objects
  * There are various abstractions and various implementations
    * *Note*: Often abstractions are in a hierarchy
* If the applications are not in a hierarchy:
  * Class diagram for Bridge Design Pattern is exactly the same as the class diagram for State Diagram Pattern
* Approach for Bridge Design Pattern:
  * Intent:
    * To decouple interfaces from the implementations that use them
  * Problem:
    * An interface that may change (or be added to) needs to be constructed
    * Several implementations of that interface
    * Avoid having each implementation implementing each interface
  * Solution:
    * Use a hierarchy of interfaces, and a hierarchy of implementations
    * Convert implementation code to a single abstract interface
    * Other interfaces are written in terms of the abstract interface
  * Implementation:
    * Use two class hierarchies, where the interface hierarchy has-an abstract implementation
* Example(s):
  * Computer drivers:
    * Drivers are generally used by various applications
    * Providing that correct driver is present and installed, many different applications may utilize hardware correctly

## Run the program
To execute the program from command line, please use the following commands:
```
javac BridgeDesignPattern.java
java BridgeDesignPattern
```

## Exercise
* In this example, Bridge Design Pattern is created, but incomplete.
* It is used for setting various themes for different computer applications:
  * Editor: Dark theme
  * Terminal: Light theme
* Both Dark and Light themes extend `Theme` class that retrieves background color and font color.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Bridge Design Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `BridgeDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output:

```
Editor: Applying theme with background color #000 and font color #FFFF
Terminal: Applying theme with background color #FFFF and font color #000
```
