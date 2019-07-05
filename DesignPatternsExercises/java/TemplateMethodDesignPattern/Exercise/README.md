# Template Method Design Pattern Exercise in Java

## Description
* Template Method Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Defines the skeleton of an algorithm as an abstract class, allowing its sub-classes to provide concrete behavior.
* Contains a method that provides the steps of the algorithm.
* Used to create a group of subclasses that have to execute a similar group of methods.
* Uses **hooks** methods:
  * Methods that call the caller of the method that called them.
* Sample structure of the Template Method Design Pattern:
  * Create an abstract class that contains a Template Method
  * Declare Template Method `final` to keep subclasses from changing the algorithm
  * Template Method contains a series of method calls that every subclass object calls
  * Subclass that extend this abstract class may override some of the method calls
  * Subclasses that extend this abstract class override methods that do not make sense for them in the default way
* It allows to:
  * Define skeleton of an algorithm as an abstract class
  * Follow defined algorithm with concrete behavior implemented in all subclasses desired way
* It is used when:
  * Group of subclasses have to execute the same (or similar) group of methods
* It is similar to Strategy Design Pattern.
* Differences with Strategy Design Pattern:
  * In Template Method Design Pattern, usually some of the methods defined within the pattern are called only once,
  but this is not true for Strategy Design Pattern.
  * In Template Method Design Pattern, the common methods are designed to be called in a specific order
  * In Strategy, the common methods may be called in different orders by different classes
* Example(s):
  * Set of operations implemented differently for different kinds of objects, but to be invoked in the same order

## Run the program
To execute the program from command line, please use the following command:

```
javac TemplateMethodDesignPattern.java
java TemplateMethodDesignPattern
```

## Exercise
* In this example, `setTravel()` is the Template Method that is created, but incomplete.
* `Travel` class defines the skeleton of travel algorithm.
* All subclasses of the `Travel` follow the same structure of the algorithm.
* Methods that are not related to a specific travel, (e.g. `setMeal()` for Road Trip) override them in the default way:
  * Left empty implementation `{}`
* Please fill in the `____________________`  blanks to make the program run successfully to follow Template Method
Design Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `TemplateMethodDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Setting travel information:
Setting dates...
Setting destination...
Selecting meal...
Booking ticket...
Air Travel:
    Travel has been confirmed. Here is details:
        Start Date: 07/04/2019
        End Date: 08/10/2019
        Destination: Tokyo, Japan
        Meal selected: Asian Vegetarian

Setting travel information:
Setting dates...
Setting destination...
Booking ticket...
Bus Travel:
    Transaction cancelled

Setting travel information:
Setting dates...
Setting destination...
Selecting vehicle...
Road Travel:
    Travel has been confirmed. Here is details:
        Start Date: 01/01/2020
        End Date: 01/10/2020
        Destination: Miami, FL, USA
        Vehicle selected: Honda Freed
```
