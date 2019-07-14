# Visitor Design Pattern Exercise in Java

## Description
* Visitor Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Its primary purpose is to abstract functionality that can be applied to an aggregate hierarchy of "element" objects.
* Separates an algorithm from an object structure by moving the hierarchy of methods into one object.
* Message sent to one object, sends a message to another object having itself as an argument.
* It allows to:
  * Add methods to classes of different types without much altering to those classes
  * Create completely different methods depending on the class used
  * Define external classes that can extend other classes without majorly editing them
  * Avoid tight coupling
* Sample structure of the Visitor Design Pattern:
  * `Visitor` is an interface or abstract class
  * It contains a `visit()` method, which is implemented in each subclass of the `Visitor`
  * Group of Element classes that use visitor object (visitable) has an `accept()`method
    * It takes an object of the `Visitor` hierarchy as an argument
    * It calls the `visit()` method on the `Visitor` object it was passed, with self (`this`) as the only argument
  * To perform an operation, a client calls `accept()` on the Element object and passes the `Visitor` object
* Example(s):
  * A document object consists of JSON and XML concrete elements:
    * User may want to access certain information of each element without having to get deep into the implementation of
    the types of elements
  * The shopping cart contains a set of elements:
    * Upon arriving at the checkout, the cashier acts as a visitor
    * Takes the set of elements, some with fixed price and others price to be determined (by weighing)
    * Provide customer with total due amount
  * Customer orders a taxi, which arrives at customer's door:
      * Once the person sits in, the visiting taxi is in control of the transport for that person

## Run the program
To execute the program from command line, please use the following command:

```
javac VisitorDesignPattern.java
java VisitorDesignPattern
```

## Exercise
* In this example, Visitor Design Pattern is used to generate report on active customers with multiple orders and orders
with multiple items. 
* Visitor's primary purpose is to abstract functionality that can be applied to an aggregate hierarchy of "element"
objects.
* The hierarchy in this example is `Customer -> Order`.
* `GeneralReport` class is the one which will go through all hierarchy and print element details.
* The `accept()` method causes flow of control to find the correct Element subclass.
* When the `visit()` method is invoked, flow of control is vectored to the correct visitor subclass.
* Customer may have multiple orders.
* Order may have multiple items.
* To display all the details, program visits all the nodes in hierarchy.
* Program is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Visitor Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `VisitorDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Customer: Customer1
Orders:
    Order1
    Items:
        Item1
        Item2
    Order2
    Items:
        Item3
        Item4

Customer: Customer2
Orders:
    Order3
    Items:
        Item5
        Item6

Number of customers: 2
Number of orders:    3
```
