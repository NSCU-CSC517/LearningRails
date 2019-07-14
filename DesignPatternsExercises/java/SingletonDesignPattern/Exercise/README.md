# Singleton Design Pattern Exercise in Java

## Description
* Singleton Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Ensures only one instance of an object is created.
* It is used when:
  * There is a need to eliminate the option of instantiating more than one object
  * Must return the single instance by using a class method

## Run the program
To execute the program from command line, please run the following commands:
```
javac SingletonDesignPattern.java
java SingletonDesignPattern
```

## Exercise
* In this example, singleton design pattern is used to manage common bank account shared by different family members.
* Once `FamilyMember` is getting instantiated, it assigns balance instance to him/her via static `getInstance()` method:
  * If requested instance of the `Balance` is `null`, it creates new one with $100 deposited
* Program is incomplete.
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Singleton Design
Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `SingletonDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
Current family balance: $100

Father deposits $1000
Balance after deposit: $1100

Son withdraws $200
Balance after withdrawal: $900

Son withdraws $1000
Insufficient balance
Balance after withdrawal: $900
```
