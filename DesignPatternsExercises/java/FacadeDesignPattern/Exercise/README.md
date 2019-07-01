# Facade Design Pattern Exercise in Java

## Description
* Facade Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Provides a simple interface to a more complex underlying object.
* It is used when:
  * There is a need of simplified interface that performs many other actions behind the scenes
  * It is preferred to hide the complexities of a system
* Allows to decouple the client from the sub components needed to perform an operation.
* Examples:
  * Design and implementation of an application for scheduling a conference room:
    * This process uses web services from the facilities team for heating
    * IT team for audiovisual
    * Security to grant access to the rooms at the booked time
    * However, a simple interface which takes care of this in the background
  * A travel agent site with simple interface that allows to book hotels and flights.

## Run the program
To execute the program from command line, please run the following commands:
```
javac FacadeDesignPattern.java
java FacadeDesignPattern
```

## Exercise
* In this example, Facade design pattern is used for issuing books to students.
* It validates student ID and book availability in the background and checkouts the book after validation.
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Facade Design
Pattern.
* Check each file for blanks.
* Fill in blanks into Google Doc Exercise.
* Start with `FacadeDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
Student ID: 2001 and Book: Java - The Complete Reference
The Book is available
You have 2 days to return it
Student ID: 2002 and Book: Java - The Complete Reference
Sorry, the book is not available
Student ID: 1 and Book: Design of Wood Structures
Student ID is invalid
```
