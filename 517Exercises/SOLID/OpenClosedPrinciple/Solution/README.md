# Open/Closed Principle Exercise

## Description
* In this exercise, we show both good example that follow Open/Closed Principle and bad example that does.
* For the "bad" example you are not required to do any work, but encouraged to run the code and look at the
implementation.
* For the "good" example, different programs and their running mechanism are created, but incomplete.
* The overview of Open/Closed Principle:
  * Software entities should be open for extension, but closed for modification.
  * In general, the behavior of a class should not need to be modified every time a new type of input is added.
  * This is somewhat related to the idea of the Information Expert from GRASP - that is, a class which contains data
  should manipulate it.
* Example:
  * If a class reads in several types of files, it should not need a switch statement for file types, and separate
  methods for each type.
  * Instead, the class for each file type should handle that process.
* For the "good" example, please fill in the `____________________` blanks to complete the code.

## "Bad" Example
* You are not required to do any work, but encouraged to run the code and look at the implementation.
* Can you identify the problem?
* Hint: ProgramRunner.java is the main class
  * ProgramRunner.java is responsible for running programs from several programming languages
  * Three classes (JavaProgram, PythonProgram, and RubyProgram) implement the Program interface, which has a getCode()
  and a getType() method
  * ProgramRunner has to figure out which type of program it has been given in order to run it, and, therefore, has an
  ugly "if" statement followed by a separate method to run every type of program
  * In production, such a system would quickly grow unwieldy, as adding any type of program requires adding to the "if"
  statement and adding new methods to the ProgramRunner, breaking the Open/Closed Principle
* Start with Bad/OpenClosedPrincipleGood.java file.

### Run the "Bad" example program
To execute "bad" example program from command line, please run the following commands:

```
cd Bad
javac OpenClosedPrincipleBad.java
java OpenClosedPrincipleBad
```

## "Good" Example
* Please fill in the `____________________` blanks to make the program run successfully to follow Open/Closed Principle.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* It is derived from the "bad" example, corrects the issues by simply adding a runProgram() method to the Program
interface.
* This renders the entire ProgramRunner class obsolete, and allows each class to handle its own execution, rather than
being tightly coupled to a ProgramRunner class.
* As a result of this change, new Program types can be added without needing to also update the ProgramRunner class.

### Run the "Good" example program
To execute "good" example program from command line, please run the following commands:

```
cd Good
javac OpenClosedPrincipleGood.java
java OpenClosedPrincipleGood
```

## Expected Output
Upon executing either of the program, you should see identical output for both as follows:

```
Running Java Code: System.out.println("hello world");
Running Python Code: print "hello world"
Running Ruby Code: puts 'hello world'
```