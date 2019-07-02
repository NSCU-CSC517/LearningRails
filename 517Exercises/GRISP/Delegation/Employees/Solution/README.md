# Delegation Exercise in Java

## Description
* Delegation is reviewed in this example and exercise using Java.
* Delegation is a process of when one object passes a message on to another object
  * Can often achieve the same effect as inheritance
* has similarities with Decorator Design Pattern.

## Run the program
To execute the program from command line, please run the following commands:

```
javac Delegation.java
java Delegation
```

## Exercise
* In this example, an Employee object makes passes a message on to `HourlyPayCalculator` and `SalaryPayCalculator`
objects without instantiating neither one of them.
  * Please review instance method vs. class method
  * What is the key word is used to call a class methods?
* `Employee` class delegates generation of yearly, monthly, and hourly pay on to appropriate object depending on the
Employee's given income
  * If salary-based is given, it calculates monthly and hourly pay
  * If hourly-based is given, it calculates monthly and yearly pay for given hours/week
* Please fill in the `____________________` blanks to make the program run successfully to illustrate Delegation in a
sorted list.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `Delegation.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
Yearly Salary: $60000.0
Monthly income: $3600.0
Hourly Rate: $30.0
Yearly Salary: $68000.0
Monthly income: $4250.0
Hourly Rate: $34.0
```
