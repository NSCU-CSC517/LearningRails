# Dependency Inversion Principle Exercise

## Description
* In this exercise, we show both good example that follows Dependency Inversion Principle and bad example that does not.
* For the "bad" example you are not required to do any work, but encouraged to run the code and look at the
implementation.
* For the "good" example, please fill in the '____________________' blanks to complete the code.
* The overview of the Dependency Inversion Principle:
  * High-level modules should not depend on low-level modules. Both should depend on abstractions.
  * Abstractions should not depend on details. Details should depend on abstractions.
  * Any object that uses another object to carry out its work is said to depend on the other object, which violates
  Dependency Inversion Principle
  * Classes should not be concerned with the implementation details of other classes, especially if functionality is not
  directly related.
  * A change to a low-level module can require a change to a high-level module.
  * A high-level modules should not get involved in performing low-level functions.
  * Example:
    * The Coca Cola CEO should not deliver products to 7/11
    * The Ruby ActiveRecord class should not say how an application's users table is to be structured
  * Too many classes are bad too
  * The ideal number of methods for a class != 1

## "Bad" Example
* You are not required to do any work, but encouraged to run the code and look at the implementation.
* Can you identify the problem?
* Hint: Bank.java is the main class
  * Bank class is a high-level class with complex functionality (redacted for this example).
  * One piece of that functionality is handling transactions between various accounts (simple, low-level classes). 
  * Bank, however, is very tightly coupled with the CheckingAccount and SavingsAccount classes.
  * Adding additional account types would exponentially increase the complexity of Bank:
    * MoneyMarketAccount
    * InvestmentAccount
    * RetirementAccount and etc.
* Start with bad/DependencyInversionPrincipleBad.java file.

### Run the "bad" example program
To execute "bad" example program from command line, please run the following commands:

```
cd bad
javac DependencyInversionPrincipleBad.java
java DependencyInversionPrincipleBad
```

## "Good" Example
* Please fill in the '____________________'  blanks to make the program run successfully to follow Dependency Inversion
Principle.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* It is derived from the "bad" Example, and the issues is corrected by adding a layer of abstraction between the various
types of accounts and the high-level Bank class.
  * Simple BasicAccount interface is added between the layers.
* Simple, uniform interface can be provided, even though each account may process transactions in different ways.
  * Dramatically simplifies the Bank class.
  * Allows for new types of accounts to be added easily.
* BasicAccount could be an abstract class.
  * Simplifies the codebase only for this example.
  * This structure would not work in a more complete system.
* Start with good/InterfaceSegregationPrincipleGood.java file.

### Run the "good" example program
To execute "good" example program from command line, please run the following commands:

```
cd good
javac DependencyInversionPrincipleGood.java
java DependencyInversionPrincipleGood
```

## Expected Output
Upon executing either of the program, you should see identical output for both as follows:

```
Before transaction:
Checking account balance is $100
Saving account balance is $0
After transaction:
Checking account balance is $50
Saving account balance is $50
```