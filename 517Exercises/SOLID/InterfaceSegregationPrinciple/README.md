# Interface Segregation Principle Exercise
                                 
## Description
* In this exercise, we show both good example that follows Interface Segregation Principle and bad example that does not.
* For the "Bad Example" you are not required to do any work, but encouraged to run the code and look at the
implementation.
* For the "Good Example", please fill in the '____________________' blanks to complete the code.
* The overview of the Interface Segregation Principle:
  * Clients should not be forced to depend on methods that they do not use.
  * Basic idea is that classes that are too big are no good.
  * Many client-specific interfaces are better than one general-purpose interface.
  * In short, it is often easy to create one general-purpose interface, and have several classes implement this
  interface.
  * The issues is when different classes need different pieces of functionality published through that interface.
  * Example:
    * MouseListener and MouseMotionListener interfaces in Java both handle MouseEvents.
      * MouseListener for clicks
      * MouseMotionListener for motions
    * Why are two listeners needed for MouseEvents, when all other kinds of events have only one listener interface?
    * Hint: What happens more frequently clicks or motions?

## "Bad" Example
* You are not required to do any work, but encouraged to run the code and look at the implementation.
* Can you identify the problem?
* Hint: Single interface, "Game" is created, for two classes "SingleplayerGame" and "MultiplayerGame"
  * The surface a logical structure.
  * Two methods published in the Game interface, are not used by both clients
    * pauseGame(): as a MultiplayerGame cannot be paused
      * MultiplayerGame is forced to throw an UnsupportedOperationException when pauseGame() is called on it
    * getServerList(): as SingleplayerGame does not have servers
      * SingleplayerGame is forced to throw an UnsupportedOperationException when getServerList() is called on it
  * This demonstrates a violation of the Interface Segregation principle.
  * Single, logical but ill-fitting interface is used by several clients, despite clear incompatibilities.
* Start with bad/InterfaceSegregationPrincipleBad.java file.

### Run the "bad" example program
To execute "Bad Example" program from command line, please run the following commands:

```
cd bad
javac InterfaceSegregationPrincipleBad.java
java InterfaceSegregationPrincipleBad
```

## "Good" Example
* Please fill in the '____________________'  blanks to make the program run successfully to follow Interface Segregation
Principle.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* It is derived from the "bad" Example, corrects the issues by splitting teh single interface Game into three interfaces
with a single method each:
  * BasicGame
  * OnlineGame
  * PausableGame
* MultiplayerGame can implement BasicGame and OnlineGame, but it does not need to implement PausableGame.
* SingleplayerGame can implement Basicgame and PausableGame.
* It corrects the need to throw UnsupportedOperationExceptions, and follows the Interface Segregation Principle by
dividing one general purpose interface into several smaller interfaces.
* Start with good/InterfaceSegregationPrincipleGood.java file.

### Run the "good" example program
To execute "Good Example" program from command line, please run the following commands:

```
cd good
javac InterfaceSegregationPrincipleGood.java
java InterfaceSegregationPrincipleGood
```

## Expected Output
Upon executing either of the program, you should see identical output for both as follows:

```
Singleplayer Game
Pausing game...
Multiplayer Game
US-East, US-West, Europe
```