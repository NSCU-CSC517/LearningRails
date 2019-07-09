# Iterator Design Pattern Exercise in Ruby

## Description
* Iterator Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Provides an uniform way to access different collections of Objects:
  * For each of the following collections of objects it is possible to access iterator
  * Treat all of the following the same way:
    * `Array`
    * `ArrayList`
    * `HashTable`
    * `HashSet`
* It is possible to write polymorphic code because each collection of objects can be referred in the same way:
  * All collections of objects implement/share common interface
  * Treat them polymorphically:
    * Eliminate duplicate code
* It allows:
  * Access objects that are stored in many different collection types
    * Create a common interface that these objects share
    * Have them provide accessor with an iterator that allows to traverse the objects they contain
* It is used when:
  * Different collections of Objects must be treated the same way
* Example(s):
  * Allow users to scan over and access the elements of a collection without knowing the underlying representation of
  the collection

## Run the program
To execute the program from command line, please use the following command:

```
ruby iterator_design_pattern.rb
```

## Exercise
* In this example, Iterator Design Pattern is created to iterate through varies data structures, but treats them all in
the same way as iterable collection of objects and print their data.
* There are three (2) different collections of `Country` objects are used:
  * `Array`
  * `Set`
* Iterator `each` can be used for both of them.
* They can be treated in the same way as iterable collection of objects.
* This exercise is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Iterator Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `iterator_design_pattern.rb` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Array of Countries:
Country: Australia -- Area: 100 -- Population: 1000
Country: Chine -- Area: 200 -- Population: 2000
Country: England -- Area: 300 -- Population: 3000

Set of Countries:
Country: Japan -- Area: 700 -- Population: 7000
Country: Russia -- Area: 800 -- Population: 8000
Country: United States -- Area: 900 -- Population: 9000
```
