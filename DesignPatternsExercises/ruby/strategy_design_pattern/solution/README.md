# Strategy Design Pattern Exercise in Ruby

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
* Example(s):
  * Online payment options:
    * Implement an online payment option that allows various means of payment
    * User may add a credit card, debit card, or bank account
    * Each of these have their own ways to do the following tasks:
      * Finding issuing bank
      * Adding account
      * Submitting payment
      * etc.

## Run the program
To execute the program from command line, please run the following commands:
```
ruby strategy_design_pattern.rb
```

## Exercise
* In this example, Strategy Design Pattern is created to illustrate extraction tool simulator that can work with 3
(three) types of files:
  * CSV
  * DB
  * TSV
* Prior making a call to extract desired file, program first instantiates correct `DataType` based on the given file:
  * `CSVDataType` for CSV file
  * `DBDataType` for DB file
  * `TSVDataType` for TSV file
* `DataType` is interface that each given data type in the program must implement.
* Upon having correct `DataType` at runtime, the program makes `DataType#extract_data` method call on correct data type
that is capable of extracting a file:
  * It initiates`Extraction#extract` method call of determined `DataType`
  * Extract method call opens a file, prints how it is extracting a file, and closes a file
* Program is incomplete.
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Strategy Design
Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `strategy_design_pattern.rb` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Extraction tool for CSV file:
Opening CSV file...
CSV Data type is getting extracted by separating row by commas...
Closing CSV file...

Extraction tool for DB file:
Opening DB file...
DB Data type is getting extracted by reading rows and columns...
Closing DB file...

Extraction tool for TSV file:
Opening TSV file...
TSV Data type is getting extracted by separating row by tabs...
Closing TSV file...
```
