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
* In this example, Interpreter is created to interpret strings representing mathematical expressions and provide correct
answer to the user.
* `Expression` is an interface which represents abstract expression class:
  * It contains `interpret()` method which each of the concrete expression class' must implement
* Program has four composite expressions, meaning that each needs additional expression to perform its own
interpretation:
  * `SummationExpression`
  * `SubtractionExpression`
  * `MultiplicationExpression`
  * `DivisionExpression`
* In this case, `Constant` is that additional expression:
  * It is terminal expression
  * It takes in the constant string as an argument and returns its equivalent constant
* The Interpreter Design Pattern in this example is incomplete.
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
