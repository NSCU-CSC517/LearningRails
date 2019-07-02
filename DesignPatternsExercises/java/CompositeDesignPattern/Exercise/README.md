# Composite Design Pattern Exercise in Java

## Description
* Composite Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Takes a group of objects into a single object.
* It allows: 
  * Treat individual objects and compositions of objects uniformly
  * Compose objects into tree structures to represent part-whole hierarchies:
    * Components can be further divided into smaller components
  * Represent the inner working of every part of a whole object individually
  * Treat both groups of parts in the same way as you treat the parts polymorphically:
    * Maximizes complexity while also remaining dynamic
* It is used when:
  * Structure data into its individual parts as well as represent the inner workings of every part of a larger object
  * Utilize both single object and a group of objects in same way (uniformly).
* Examples:
  * Individuals are treated as group of people:
    * Contact list contains individual people as well as groups of people, such as families or relatives:
    * Mom
    * Dad
    * 4 (four) members of a family consisting:
      * Uncle Bob
      * Aunt Carol
      * Cousin Jason
      * Cousin Katelyn
    * Need to be able to message people individually, or in groups, such any parent, or Uncle Bob's Family.
    * When message to a group of people, the effect is to send the same message to each individual in the group.
  * For compiler the same methods (e.g., parse) would be defined on an expression that are defined on an identifier.

## Run the program
To execute the program from command line, please run the following commands:
```
javac CompositeDesignPattern.java
java CompositeDesignPattern
```

## Exercise
* In this example, Composite Design Pattern is used to treat individual block in the same way as a structures of
individual blocks.
* Each structure has a list of children, which consists of either:
  * Individual blocks
  * Other Structure that has its own list of children
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Composite Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `CompositeDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
Assembling "1" structure using its list of child Group objects
Assembling "2" structure using its list of child Group objects
Adding a block with dimensions 1 x 2
Adding a block with dimensions 3 x 4
Created "2" structure from its list of child Group objects
Assembling "3" structure using its list of child Group objects
Adding a block with dimensions 5 x 6
Created "3" structure from its list of child Group objects
Created "1" structure from its list of child Group objects
```
