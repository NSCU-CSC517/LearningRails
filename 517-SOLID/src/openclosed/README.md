# Open/Closed Principle Examples

## Overview of principle
* "Software entitites should be open for extension, but closed for modification"

In general, the behavior of a class should not need to be modified every time a new type of input is added. This is somewhat related to the idea of the Information Expert from GRASP - that is, a class which contains data should manipulate it. For example, if a class reads in several types of files, it should not need a switch statement for file types, and seperate methods for each type. Instead, the class for each file type should handle that process.

## "Bad Example"
Main class - ProgramRunner.java

In this example, ProgramRunner.java is responsible for running programs from several programming languages. Two classes (PythonProgram and RubyProgram) implement the Program interface, which has a getCode() and a getType() method. ProgramRunner has to figure out which type of program it has been given in order to run it, and therefore has an ugly if statement followed by a seperate method to run every type of program. In production, such a system would quickly grow unwieldy, as adding any type of program requires adding to the if statment and adding new methods to the ProgramRunner, breaking the Open/Closed Principle. 

## "Good Example" Idea

For the Good Example (not yet completed), one would simply add a "runProgram()" method to the Program interface. This would render the getType() method AND the entire ProgramRunner class obsolete. 
