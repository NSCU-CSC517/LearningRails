# Liskov Substitution Principle Exercise

## Description
* In this exercise, we show both good example that follows Liskov Substitution Principle and bad example that does not.
* For the "Bad Example" you are not required to do any work, but encouraged to run the code and look at the
implementation.
* For the "Good Example", please fill in the '____________________' blanks to complete the code.
* The overview of the Liskov Substitution Principle:
  * Subtypes must be substitutable for their base types
  * "Functions that use pointers or references to base classes must be able to use objects of derived classes without
  knowing it."
    * In short, if X is a Y, it should be able to do everything a Y can do
    * Any time you replace a Y with an X, there should not be any unexpected side effects
  * Example:
    * Square is a Rectangle, but making Square a subclass of Rectangle would make Rectangle's setWidth() and setHeight()
    methods behave strangely (as a square would have to set both for either method).

## "Bad Example"
* You are not required to do any work, but encouraged to run the code and look at the implementation.
* Can you identify the problem?
* Hint: Should DesktopComputer and Phone both be Computer?
  * Computer object keeps track of its amount of RAM and its OS version.
  * It has methods for upgrading the RAM and updating the OS.
  * Two classes, a DesktopComputer and a Phone, extend this class and implement its methods.
  * A ComputerUpgrader object claims to be able to upgrade any Computer (that is, add more RAM and update the OS), but
  it really can not add more RAM to a phone
  * It must check to make sure the Computer object it has been given isn't a Phone. 
  * This violates the LSP, as a Phone cannot fully be substituted for a Computer.
* Start with bad/LiskovSubstitutionPrincipleBad.java file.

### Run the "Bad Example" program
To execute "Bad Example" program from command line, please run the following commands:

```
cd bad
javac LiskovSubstitutionPrincipleBad.java
java LiskovSubstitutionPrincipleBad
```
## "Good Example"
* Please fill in the '____________________'  blanks to make the program run successfully to follow Liskov Substitution
Principle.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* It is derived from the "Bad Example", corrects the issues by adding a new interface "HardwareUpgradable"
* "HardwareUpgradable" implemented by Computers which can have their hardware upgraded
  * DesktopComputer can
  * Phone cannot Next
* The upgrade() method in ComputerUpgrader splits into two:
  * upgradeRAM(), which accepts HardwareUpgradable
  * upgradeOS(), which accepts any computer)
* No type checking is necessary.
* Start with good/LiskovSubstitutionPrincipleGood.java file.
    
### Run the "Good Example" program
To execute "Good Example" program from command line, please run the following commands:

```
cd good
javac LiskovSubstitutionPrincipleGood.java
java LiskovSubstitutionPrincipleGood
```

## Expected Output
Upon executing either of the program, you should see identical output for both as follows:

```
Before the OS update and RAM upgrade: 
Desktop Computer has OS version: 1, and amount of RAM: 4 GB.
Phone has OS version: 1, and amount of RAM: 4 GB.
After the OS update and RAM upgrade: 
Desktop Computer has OS version: 2, and amount of RAM: 20 GB.
Phone has OS version: 2, and amount of RAM: 4 GB.
```
