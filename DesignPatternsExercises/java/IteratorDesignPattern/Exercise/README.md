# Iterator Design Pattern Exercise in Java

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
javac IteratorDesignPattern.java
java IteratorDesignPattern
```

## Exercise
* In this example, three (3) different collections of `Country` objects are used:
  * `Array`
  * `List`
  * `HashSet`
* They share common interface.
* `Iterator` can be accessed for each one of them.
* They can be treated the same way and print some data.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Iterator Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `IteratorDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Country: India Area: 120 Population: 1252
Country: China Area: 370 Population: 1357
Country: United States Area: 380 Population: 316

Array of Countries:
Country: Australia Area: 297 Population: 23
Country: Germany Area: 14 Population: 81
Country: France Area: 25 Population: 66

List of Countries:
Country: Russia Area: 660 Population: 143
Country: Japan Area: 14 Population: 127
Country: England Area: 5 Population: 53
```
