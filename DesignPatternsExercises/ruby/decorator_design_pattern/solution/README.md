# Decorator Design Pattern Exercise in Ruby

## Description
* Decorator Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern:
  * More flexible than inheritance
  * Does not use Inheritance
  * But can be considered as an alternative to inheritance
* It allows:
  * For an object's behavior to be extended dynamically at run time
  * An object to be modified dynamically
* It is used when:
  * The capabilities of inheritance with subclasses are needed, but adding functionality at run time is required
* Simplifies codebase due to added functionality using many simple classes.
* Rather than rewriting old code it can be extended with new code.
* Example(s):
  * Build/decorate structural object out of many other objects of the same type:
    * Create basic (default) structural object
    * Add as many as required objects to decorate structural object
    * Decoration of structural object is made of many other objects

## Run the program
To execute the program from command line, please use the following command:

```
ruby decorator_design_pattern.rb
```

## Exercise
* In this example, Decorator Design Pattern is created, but incomplete.
* It is used to customize gaming PC out of basic computer by adding varies hardware parts and thus adding cost to it.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Decorator Design
Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* Start with `decorator_design_pattern.rb` file.

## Expected Output
Upon executing the program, you should see the following output:

```
Parts: RAM =256 MB ROM = 4 GB Solid State Drive = 200 GB Graphics Card = 2 GB
Cost = 290
```
