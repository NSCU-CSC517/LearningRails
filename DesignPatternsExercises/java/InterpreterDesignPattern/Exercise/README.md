# Interpreter Design Pattern Exercise in Java

## Description
* Interpreter Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Accesses the elements of an object sequentially without exposing its underlying representation.
* It is used to convert one representation of data into another.
* It can be extremely useful if combined with Java Reflection techniques.
* It is really an application of Composite!
* It is ignored most of the time:
  * Almost never used
* It allows:
  * Implement convenient way of interpreting variety unfamiliar system into something meaningful
* It is used when:
  * Requires interpretation of some complex objects
* Example(s):
  * Interpret various un-traditional measurements units into SI units
    * Feet into meters
    * Gallons into liters

## Run the program
To execute the program from command line, please use the following command:

```
javac InterpreterDesignPattern.java
java InterpreterDesignPattern
```

## Exercise
* In this example, Interpreter Design Pattern is created to interpret strings representing mathematical expressions and
provide correct answer on these mathematical expressions to the user.
* `Statement` is an interface which represents any mathematical statement and which is implemented by an abstract
`Expression` class and `Constant` class:
  * It has `interpret()` method that interprets:
    * Mathematical expressions for a two given constants and operator, and provides an answer for it, or
    * String representing constant into integer required for interpreting expression
* `Expression` is an abstract class that implements `Statement` interface:
  * Each of its subclasses extend it and override `interpret()` method
* Program has four composite expressions (e.g. subclasses of `Expression` abstract class), meaning that each needs to
interpret required statements embedded within a given string to perform its own interpretation:
  * `SummationExpression`
  * `SubtractionExpression`
  * `MultiplicationExpression`
  * `DivisionExpression`
* In this example, `Constant` objects are these required statements:
  * It implements `Statement` interface and thus, overrides `interpret()` method:
    * It takes in as an argument a string representing constant and returns its equivalent integer constant
* The Interpreter Design Pattern in this example is created, but incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Interpreter Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `InterpreterDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
50 + 50 = 100
100 - 3 = 97
5 * 5 = 25
9 / 3 = 3
```
