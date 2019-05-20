# Interface Segregation Examples

## Overview of principle

* "Clients should not be forced to depend on interfaces they do not use"
* "Many client-specific interfaces are better than one general-purpose interface"

In short, it is often easy to create one general-purpose interface, and have several classes implement this interface. Issues can arise when different classes need different pieces of functionality published through that interface.

## "Bad" Example
In this example, a single interface, "Game" is created, for two classes, "SingleplayerGame" and "MultiplayerGame". This is on the surface a logical structure. However, in this case, the methods getServerList and pauseGame, published in the Game interface, are not used by both clients (As a MultiplayerGame cannot be paused, and a SingleplayerGame does not have servers). Because of this mismatch, the SingleplayerGame is forced to throw an UnsupportedOperationException when getServerList is called on it, and MultiplayerGame is forced to throw an UnsupportedOperationException when pauseGame is called on it. This demonstrates a violation of the Interface Segregation principle, as a single, logical but ill-fitting interface is used by several clients, despite clear incompatibilities.

## "Good" Example
This example is derived from the "Bad" Example. In this case, the single interface "Game" was split into three interfaces with a single method each - BasicGame, OnlineGame, and PausableGame. With this split, MultiplayerGame can implement BasicGame and OnlineGame, but it does not need to implement PausableGame (as it is not pausable), and SingleplayerGame can implement Basicgame and PausableGame (as it can be paused but is not online). This corrects the need to throw UnsupportedOperationExceptions, and follows the ISP by dividing one general purpose interface into several smaller interfaces.

### Fill-in-the-blank answers
1. BasicGame
2. getGameName
3. pauseGame
4. PausableGame
5. getGameName