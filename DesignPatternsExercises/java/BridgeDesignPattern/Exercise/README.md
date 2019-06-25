# Bridge Design Pattern Exercise in Java

## Description
* Bridge Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Decouples an abstraction from its implementation so that the two can vary independently.
* Decouples a set of implementations from set of objects using them.
* Progressively adding functionality while separating out major differences using abstract classes.
* It is used when:
  * There is a need to build a group of classes that slowly added functionality from one class to the next
  * There are two hierarchies of objects
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

## Run the program
To execute the program from command line, please run the following commands:
```
javac BridgeClient.java
java BridgeClient
```

## Exercise
* In this example, Bridge Design Pattern is used to set various themes for different computer applications:
  * editor
  * terminal, and etc.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Bridge Design Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `BridgeClient.java` file.

## Expected Output
Upon executing the program, you should see the following output:

```
Editor : Applying theme with background color #000 and font color #fff
Terminal : Applying theme with background color #fff and font color #000
```
