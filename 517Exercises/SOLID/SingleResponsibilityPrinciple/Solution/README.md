# Single Responsibility Principle Exercise

## Description
* In this exercise, we show both good example that follows Single Responsibility Principle and bad example that does not.
* For the "bad" example you are not required to do any work, but encouraged to run the code and look at the
implementation.
* For the "good" example, please fill in the `____________________` blanks to complete the code.
* The overview of Single Responsibility Principle:
  * A class should have only one reason to change.
  * According to Martin, "Gather together the things that change for the same reasons. Separate those things that change
  for different reasons."
  * In some way good cohesion: "Every class should be responsible for doing one thing only and doing it well."
  * Too many classes are bad too.
  * The ideal number of methods for a class != 1.

## "Bad" Example
* You are not required to do any work, but encouraged to run the code and look at the implementation.
* Can you identify the problem?
* Hint: CityMap.java is the main class.
  * Represents a map consisting of a list of cities with various attributes.
  * Takes on several very separate pieces of functionality which should be divided into several classes.
    * Managing the list of cities
    * Drawing th map on the screen
    * Calculating the total population
* Start with Bad/SingleResponsibilityPrincipleBad.java file.

### Run the "Bad" example program
To execute "bad" example program from command line, please run the following commands:

```
cd Bad
javac SingleResponsibilityPrincipleBad.java
java SingleResponsibilityPrincipleBad
```

## "Good" Example
* Please fill in the `____________________`  blanks to make the program run successfully to follow Single Responsibility
Principle.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* It is derived from the "bad" example, corrects the issues by simply splitting the CityMap class into two classes
  * Map
    * Focuses solely on drawing the map on a screen
  * CityList
    * Maintains the ArrayList of cities
    * Calculates the total population
* Start with Good/SingleResponsibilityPrincipleGood.java file.

### Run the "Good" example program
To execute "good" example program from command line, please run the following commands:

```
cd Good
javac SingleResponsibilityPrincipleGood.java
java SingleResponsibilityPrincipleGood
```

## Expected Output
Upon executing either of the program, you should see identical output for both as follows:

```
Drawing Triangle Map with dimensions 10 x 10
Raleigh --> Durham --> 
```