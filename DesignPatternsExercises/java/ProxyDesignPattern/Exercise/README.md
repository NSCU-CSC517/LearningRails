# Proxy Design Pattern Exercise in Java

## Description
* Proxy Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Provides a placeholder interface to an underlying object to control access, reduce cost, or reduce complexity.
* Provides a class which will limit access to another class:
  * Acts as a gate keeper that blocks access to another object
* Provide a surrogate or placeholder for another object to control access to it.
* Implemented by means of code that takes care of communicating with the remote object.
* Proxy implements the same interface as the interface implemented by the object:
  * Placing object behind proxy to limit access to all or some public methods
* It allows to:
  * Limit access to the methods from unknown classes/objects
* It is used when:
  * Security and protection is an issue:
    * Object is intensive or costly to create
    * Object is accessed from a remote location and need to have permissions
* Both Decorator and Proxy patterns delegate execution of a method to the subject.
* Example(s):
  * Using Rails statements rather than SQL code to access a database.

## Run the program
To execute the program from command line, please use the following command:

```
javac ProxyDesignPattern.java
java ProxyDesignPattern
```

## Exercise
* In this example, `MovieProxy` is created, but incomplete.
* `MovieProxy` acts as a proxy to limit access for certain actions on `Movie` objects:
  * It blocks `deleteMovie()` method call for all movie objects
  * All other method calls it passes towards the movie object
* Please fill in the `____________________`  blanks to make the program run successfully to follow Proxy Design Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `ProxyDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Movie:
    Name: The Prestige
    Size: 1023 MB
    Director: Christopher Nolan
Playing movie: The Prestige
Stopped movie: The Prestige
Deleting movie: Permission denied!!!
```
