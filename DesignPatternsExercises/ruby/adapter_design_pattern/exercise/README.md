# Adapter Design Pattern Exercise in Ruby

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
ruby adapter_design_pattern.rb
```

## Exercise
* In this example, Adapter Design Pattern for displaying appropriate OS type is created, but incomplete.
* Program must display/print appropriate name of the OS once it invokes `display` method call.
* But each OS has different name for such a method call:
  * Linux OS: `display_linux`
  * Mac OS: `display_mac`
  * Windows OS: `display_windows`
* `GUIAdapter` class creates an adapter and redirects `display` method call to the appropriate class.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Adapter Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `adapter_design_pattern.rb` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
Linux OS
Mac OS
Windows OS
```
