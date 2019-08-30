# Inheritance and Modules Exercise in Ruby

## Description
* This exercise is about Inheritance and Modules in Ruby.
* Modules in Ruby are a way to group together methods, classes and constants.
* Modules in Ruby are similar to namespaces in languages such as C++.
* Modules define a namespace.
* When a program needs to use modules, it can simply load files using the Ruby `require` statement, and reference the
qualified names.
* Mixin: the most interesting use of modules is to define mixins
  * When a module is `include`(d) within a class, all its functionality becomes available to the class
  * The methods of the module become instance methods in the class that `includes` it
* Instead of implementing interfaces as in Java, one uses Mixins in Ruby when one wants to simulate multiple inheritance!

## Run the program
To execute the program from command line, please use the following commands:

```
ruby inheritance_and_modules.rb
```

## Exercise
* Suppose that `travel_around_the_city` is called on an instance of `CityVehicle`.
* What is the order that classes or modules will be checked in to find the `travel_around_the_city` method that should
be called?
* Please write additional code, or modify existing code, or commented out any parts of the code as needed to test the
order in which classes or modules are getting checked.
* Feel free to modify the code in any way you need to understand the order of execution.

## Expected Output
The expected output depends upon how provided code is modified and what function calls were commented out or added. In
general expected output is the print statement of `travel_around_the_city` in each corresponding class and module.
