# Adapter Design Pattern Exercise in Java

## Description
* Adapter Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Makes it possible for two and more incompatible interfaces to work together.
* Provides a way to use familiar methods on an object whose methods have "strange" names.
* Any class can work together as long as the Adapter solves the issue of all classes that must implement every method
defined by the shared interface.
* Each step is separated by either an abstract class or an interface:
  * Makes it possible to create extremely flexible objects
* vs. Facade Design Pattern:
  * Similar to Facade Design Pattern
  * Adapter Design Pattern does not hide any functionality like Facade Design Pattern does
  * Adapter Design Pattern changes one command to another command
* It allows:
  * Utilization of the available interface and the target interface
  * Two and more incompatible classes to work together
    * Wraps an interface around one of the existing classes
* It is used when:
  * Client expects a target interface
  * Merging multiple projects/programs:
    * Translate one interface of a class into another interface
    * Only works with one known target interface
* Example:
  * Mobile site vs. desktop site:
    * Two sites are different
    * Some users wish to see the desktop site on their mobile devices
    * When such request is made, handle the request and show the user the desktop site
  * Cartesian coordinates vs. Polar coordinates:
    * Cartesian coordinates may be expressed in polar coordinates with an adapter interface
    * Adaptee is polar point object

## Run the program
To execute the program from command line, please use the following command:

```
javac AdapterDesignPattern.java
java AdapterDesignPattern
```

## Exercise
* In this example, adapter for displaying a sample GUI frame is created, but incomplete
* Program must display a sample GUI frame with appropriate name based on OS of the user running the program:
  * Linux Application
  * Mac Application
  * Windows Application
* OS of the user is determined at runtime and `AdapterDesignPattern` allows for all incompatible Frames to display a
sample GUI frame
* Please fill in the `____________________`  blanks to make the program run successfully to follow Adapter Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `AdapterDesignPattern.java` file.

## Expected Output
It varies depending on the OS where the program is executed. If all blanks are filled in correctly, user must be able to
see a sample frame GUI displayed on his/her screen.

### Expected Output on the CS50 Sandbox
Upon executing the program on the CS50 Sandbox, you should `Linux Application` frame GUI displayed on the Sandbox scree.
You may close it at anytime as regular application by clicking `x` on the frame and program will terminate.
