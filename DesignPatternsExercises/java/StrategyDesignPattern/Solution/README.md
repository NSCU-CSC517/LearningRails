# Strategy Design Pattern Exercise in Java

## Description
* Strategy Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* It allows:
  * One of a family of algorithms to be selected on-the-fly at run-time
  * To eliminate code duplication
  * An algorithm vary independently from clients that use it
  * Clients to change algorithms at run time by using a different strategy object
* Separates behavior from super and subclasses.
* Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
* It is used when:
  * Program needs to dynamically change an algorithm used by an object at run time
  * There is a set of things that need to do in different ways, depend upon what kind "thing" (e.g. account):
    * If it is Bank Account, things are done Bank Account way
    * If it is Debit Card, things are done via Debit Card way
  * There is a set of methods and what set is used depends upon what kind object is being processed
* Approach for Strategy Design Pattern:
  * Intent:
    * To decouple algorithms from the objects that use them
  * Problem:
    * Code must be written in the way that it will work with objects that behave differently
    * Host class does not need to know how the objects behave, but needs to invoke the different behaviors when
    appropriate
  * Solution:
    * Create different classes, each of which defines the behavior for one type of object
    * When the host class wants to invoke a certain behavior, it merely calls a method of the appropriate behavior class
  * Implementation:
    * The behavior classes are usually subclasses of a class that defines an abstract behavior
    * Then the host class invokes a method of the abstract behavior class, and what is really called is a method of the
      concrete behavior class.
* Difference between Strategy Design Pattern and Command Design Pattern:
  * The Command Design Pattern is to store many commands needed to execute
  * The Strategy Design Pattern is to decide different way to solve a problem.
* Difference between Strategy Design Pattern and Template Method Design pattern:
  * In Strategy Design Pattern, it is NOT the case that usually some of the methods defined within the pattern are
    called only once
   * This is true Template Method Design Pattern
  - In Strategy Design Pattern, the common methods are designed to be called in different orders by different classes
  - In Template Method, they are going to be called in a specific order
* Examples:
  * Implement an online payment option that allows various means of payment
  * User may add a credit card, debit card, or bank account
  * Each of these have their own ways of finding the issuing bank, adding the account, and submitting payment, among
  other tasks.

## Run the program
To execute the program from command line, please run the following commands:
```
javac StrategyPatternExample.java
java StrategyPatternExample
```

## Exercise
* In this example, extraction system for 3 types of files is created, but incomplete.
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Strategy Design
Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `StrategyPatternExample.java` file.

## Expected Output
Upon executing the program, you should see the following output:

```
Select one of the data types (d-Database/c-CSV/t-TSV): 
```

The program then prompts the user to enter desired data type by a single letter (e.g., 'd', 'c', or 't').
The following is sample output of each run with different data type.

* For option 'd'
```
Select one of the data types (d-Database/c-CSV/t-TSV): 
d
Opening database file
DB: I will extract by reading rows and columns
Closing database file
```

* For option 'c'
```
Select one of the data types (d-Database/c-CSV/t-TSV): 
c
Opening CSV file
CSV: I will extract by separating row by commas.
Closing CSV file
```

* For option 't'
```
Select one of the data types (d-Database/c-CSV/t-TSV): 
t
Opening TSV file
TSV: I will extract by separating row by tabs.
Closing TSV file
```
