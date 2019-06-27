# Reflection Exercise in Ruby

## Description
* This exercise utilizes Reflection in Ruby.
* It has been demonstrated that Ruby programs can discover things about themselves at run time.
  * `3.14159.method`
* Reflections is "Looking at current objects and listing the messages they can respond to".
* It allows program entities to discover things about themselves through introspection.
  * An object can ask what its methods are, and a class can tell what its ancestors are
* The related technique of metaprogramming allows one to create new program entities, such as methods or classes, at run
time
  * While it may be useful, in debugging, to print out the class of an object, it is almost always a mistake to test the
  class of an object:
    * `if s.kind_of? Integer then this_method else that_method`

## Run the program
To execute the program from command line, please use the following commands:

```
ruby reflection.rb
```

## Exercise
* Please fill in the `____________________` blanks using instance reflection to make the program run successfully and
get expected output.

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
Student
Object
@name
name
show_identity
@@university
name
Im a student

private_method
initialize
```
