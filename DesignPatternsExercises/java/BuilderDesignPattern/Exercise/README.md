# Builder Design Pattern Exercise in Java

## Description
* Builder Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Creates objects made from bunch of other objects at run time.
  * By having different classes building the object it can then easily create many different types of objects without
  being forced to rewrite code
* Hides creation of the complex object's parts from the client (`BuilderDesignPattern` class in this example) class
  * Both client class and builder class are independent of each other
* In creating a complex object, uses more than one creation method to create a single object.
* Provides different way to create complex objects such as objects created using the Abstract Factory design pattern.
* Only the builder knows the specifics and no other class does
* It allows:
  * Create complex objects with help of other classes
  * Creation process of objects' parts to be independent of the main object
  * Hide creation of the complex object's parts from the client (`BuilderDesignPattern` class in this example) class
    * Both client class and builder class are independent of each other
* It is used when:
  * Creating complex objects
  * Building an object made up from other objects
  * Any time building complex object and sending messages to it to customize it:
    * Especially Cascade the messages (one sent message results in sending additional message to it).
* Example:
  * Complex `Car` object:
    * At ABC showroom class `Car` may have following properties:
      * Model: Audi, BMW, Mercedes, etc.
      * Transmission: automatic or manual
      * Airbags: true or false
      * Convertible: true or false
    * Builder Design Pattern class should be created in the following way:
      * `void setMake(String Make)  { // Sets make }`
      * `void setTransmissionType() { // Sets transmission type }`
      * `void setConvertible()      { // Sets boolean }`
      * `void setWithAirbags()      { // Sets boolean }`

## Run the program
To execute the program from command line, please use the following command:

```
javac BuilderDesignPattern.java
java BuilderDesignPattern
```

## Exercise
* In this example, Builder Design Pattern is used for building complex computer system that may have multiple HW
components of the same type.
* Complex `Computer` object is created with help of `ComputerEngineer` and `ComputerBuilder`.
* It utilizes `ComputerEngineer` object to create `ComputerBuilder`, which creates `Computer` object.
* `ComputerBuilder` class is used to build complex computer system with varies HW components of unlimited quantities
added to it:
  * It builds basic computer with no HW components at first
  * It starts adding multiple HW components to computer by utilizing `add*` method calls
* Computer may or may not have the following HW properties:
  * One or more monitors
  * One or more RAMs
  * One or more HDDs
  * Different type of Mouse
* Once `ComputerEngineer` creates new `ComputerBuilder` object, which creates new `Computer` object, program utilizes
`ComputerBuilder` by start adding multiple HW components into computer by calling `add*` methods on the `Computer`
object.
* Once `add` is triggered in `Computer` class, it stores HW components into corresponding list of HW components.
* To retrieve all these HW components, computer lists of HW are invoked directly from the client.
* The program is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Builder Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `BuilderDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Computer is assembled and with the following parts.
List of Monitors:
    17 inches
    28 inches
List of RAMs:
    256 MB
Total Ram Capacity: 256 MB
List of HDDs:
    64 GB
    512 GB
    1024 GB
    2048 GB
Total HDD Capacity: 3648 GB
Computer Mouse Type: Optical
```
