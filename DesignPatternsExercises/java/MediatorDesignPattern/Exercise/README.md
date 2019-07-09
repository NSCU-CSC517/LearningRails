# Mediator Design Pattern Exercise in Java

## Description
* Mediator Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* The "Gang of Four" definition:
  * "Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other"
* Promotes loose coupling by avoiding the need for classes to know "too much" about other classes:
  * Law of Demeter
* It is used to handle communication between related objects (Colleagues).
* All communication is handled by a Mediator Object and the Colleagues do not need to know anything about each other to
work together.
* Reduces the number of different protocols needed for inter-object communication.
* It allows:
  * Loose coupling between classes by being the only class that has detailed knowledge of their methods
  * For the actions of each object set to vary independently of one another
* It is used when:
  * Managing communication between different classes in a complex system
* Example(s):
  * Devices on the network:
    * Communication among varies devices on the same network
    * A device does not have any information about other devices it needs to send the message except their type
    * Mediator can send the message to devices found by the given type

## Run the program
To execute the program from command line, please use the following command:

```
javac MediatorDesignPattern.java
java MediatorDesignPattern
```

## Exercise
* In this example, `Mediator` class is acting as a mediator between `Seller` and `Buyer` objects for currency exchange.
* Note that any buyer-seller interaction occurs strictly through the mediator:
  * No direct interaction
* Flow of any transaction or currency exchange:
  * Buyer inquiries mediator with purchasing request of N amount specific currency (USD, EUR, etc)
  * Mediator inquiries sellers whether there are any sellers with the desired currency and selling price
  * If there is at least one such seller:
    * Mediator sends bid acceptance message to buyer
    * Mediator completes transaction
* All the currency rates and conversion is handled by the `CurrencyCoverter` class.
* This exercise is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Mediator Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `MediatorDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Buyer is attempting a bid of GBP 79.0
Seller gbpSeller1 rejects the bid of USD 99.07198
Seller gbpSeller2 accepts the bid of USD 99.07198

Buyer is attempting a bid of GBP 79.0
Seller gbpSeller1 rejects the bid of USD 99.07198

Buyer is attempting a bid of INR 20000.0
Seller inrSeller1 rejects the bid of USD 309.88535
Seller inrSeller2 rejects the bid of USD 309.88535

Buyer is attempting a bid of RUS 1.0
Seller is not found for 1.0 RUS
```
