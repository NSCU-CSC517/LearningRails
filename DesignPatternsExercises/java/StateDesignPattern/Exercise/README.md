# State Design Pattern Exercise in Java

## Description
* State Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Allows an object to alter its behavior when its internal state changes:
  * The object will appear to change its class
* Defines a set of concrete State objects.
* Defines a "context" class to present a single interface to the outside world.
* Represents the different "states" of the state machine as derived classes of the State base class.
* Defines state-specific behavior in the appropriate State derived classes.
* It allows:
  * Maintain a pointer to the current "state" in the "context" class
* It is used when:
  * What the program does depends upon:
    * The state it is in
    * The input from the user (or from the framework above)
* Sample structure of the State Design Pattern:
  * Context:
    * Maintains an instance of a ConcreteState subclass that defines the current state
  * State:
    * Defines an interface for encapsulating the behavior associated with a particular state of the Context
  * Concrete State:
    * Each subclass implements a behavior associated with a state of Context
* Approach to use State Design Pattern:
  * Intent:
    * Allow an object to alter its behavior when its internal state changes
    * The object will appear to change its class
  * Problem:
    * A monolithic object's behavior is a function of its state, and it must change its behavior at runtime depending on
    that state
    * Or an application is characterized by large and numerous case statements that vector flow of control based on the
    state of the application
  * Solution:
    * Define a set of State objects
    * Defer the implementation of the different methods to the State objects
    * The client changes its state from time to time.
  * Implementation:
    * Define a "context" class to present a single interface to the outside world
    * Define a State abstract base class
    * Represent the different "states" of the state machine as derived classes of the State base class
    * Define state-specific behavior in the appropriate State derived classes
    * Maintain a pointer to the current "state" in the "context" class
    * To change the state of the state machine, change the current "state" pointer
* Example(s):
  * Change physical positions of a person based on his/her previous conditions.
    * If person is standing and user presses "Up", person should jump
    * If in same position user presses "Down", person should sit
    * If person is sitting and user presses "Up", person should stand up

## Run the program
To execute the program from command line, please use the following command:

```
javac StateDesignPattern.java
java StateDesignPattern
```

## Exercise
* In this example, State Design Pattern is created, but incomplete to simulate an ATM Machine  
* Success of an action given by the program depends on the current state of the ATM Machine
  * Card is ejected:
    * May not withdraw nor eject card
    * May insert card
  * Card is inserted:
    * May withdraw and eject card
    * May not insert card
* Please fill in the `____________________`  blanks to make the program run successfully to follow State Design Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `StateDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
ATM Machine current state: CardEjectedState
No card in ATM Machine slot, unable to withdraw...
No card in ATM Machine slot, unable to eject the card...

ATM Machine current state: CardEjectedState
Card is inserted...

ATM Machine current state: CardInsertedState
Money are withdrawn...
Card is ejected...
```
