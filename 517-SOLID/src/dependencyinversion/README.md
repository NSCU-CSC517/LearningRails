# Dependency Inversion Principle

## Overview of Principle

* "High-level modules should not depend on low-level modules. Both should depend on abstractions."

* "Abstractions should not depend on details. Details should depend on abstractions."

That is, as much as possible, classes should not be concerned with the implementation details of other classes, especially if functionality is not directly related.

## "Bad" Example
Main Class: DocumentManager

In this example, a DocumentManager class handles information about paper documents, and provides functionality for those documents. One piece of functionality it provides is the ability to print a given document. In order to accomplish this, however, it must select the appropriate printer for the physical size of the document (big or small), and call the appropriate method from either the BigPrinter or SmallPrinter classes. This leads the DocumentManager class to be very highly coupled to those classes, and to be very dependent on the specific methods in both the BigPrinter and SmallPrinter classes.