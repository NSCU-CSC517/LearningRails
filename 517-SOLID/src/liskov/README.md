# Liskov Substitution Principle

## Overview of principle
* "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it."
In short, if X is a Y, it should be able to do everything a Y can do. Any time you replace a Y with an X, there should not be any unexpected side effects. For example, a Square is a Rectangle, but making Square a subclass of Rectangle would make Rectangle's setWidth() and setHeight() methods behave strangely (as a square would have to set both for either method).

## "Bad" Example
In this example, a Computer object keeps track of its amount of RAM and its OS version. It also has methods for upgrading the RAM and updating the OS. Two classes, a DesktopComputer and a Phone, extend this class and implement its methods. A ComputerUpgrader object claims to be able to upgrade any Computer (that is, add more RAM and update the OS), but it really can't add more RAM to a phone, so it has to check to make sure the Computer object it has been given isn't a Phone. This violates the LSP, as a Phone cannot fully be substituted for a Computer.

