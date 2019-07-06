# Chain of Responsibility Design Pattern Exercise in Java

## Description
* Chain of Responsibility Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Delegates commands to a chain of processing objects.
* Promotes idea of loose coupling.
* Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
* There are more than one message handlers for a message, the appropriate message handler is not known by the sender of
the message.
* Group of objects that are expected among them to be able to solve a problem:
  * If the first Object can not solve it, it passes the data to the next Object in the chain
* It allows:
  * Process and handle messages in the form of link list
  * Connect all messages handlers into one chain
* It is used when:
  * There is variety of message processors and handlers 
* Example:
  * Required to read an image file:
    * The file may be in .jpg, .png or .tif format
    * Three different file formats are read using different method
  * An interrupt handler

## Run the program
To execute the program from command line, please use the following command:

```
javac ChainOfResponsibilityDesignPattern.java
java ChainOfResponsibilityDesignPattern
```

## Exercise
* In this example, support chain as the chain of responsibility for varies issues is created, but incomplete.
* Each support link of chain is connected with each other through the `nextSupportLink`
* First support link of chain verifies whether it can handle the issue or not:
  * If it is unable to handle it, it passes to the next support link
  * Next support link verifies whether it can handle the issue or not:
    * If it is unable to handle it, it passes the issue further
  * etc.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Chain of
Responsibility Design Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `ChainOfResponsibilityDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Production support team will contact you shortly
```
