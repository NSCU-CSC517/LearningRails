# Observer Design Pattern Exercise in Java

## Description
* Observer Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* It is a publish/subscribe pattern which allows a number of observer objects to see an event:
  * An object, called the subject (Publisher), maintains a list of its dependents
  * Notifies them automatically of any state changes
    * Usually by calling one of their methods
  * Dependents are called observers (Subscribers)
* Sometimes known as Publish-Subscribe.
* Model-View-Controller is built from instances of the Observer pattern.
* The Observer is responsible for registration, not the subject.
* It is often used in user interfaces.
* Benefits:
  * Loose coupling:
    * The Subject (publisher) does not need to know anything about the Observers (subscribers)
* Drawbacks:
   * The Subject (publisher) may send updates that do not matter to the Observer (subscriber)
* It allows:
  * Avoid polling
  * Observer object to be notified of an event
* It is used when:
  * Many objects need to receive an update when one object changes
    * See Stock Market Example
  * Objects need to receive notification but avoid polling
  * An object needs to notify other objects, without knowing in advance which these objects are and how many of them
  * One-to-many dependency between objects is defined:
    * If one object changes state, all its dependents are notified and updated automatically
* Example:
  * Stock Market:
    * Stock market with thousands of stocks needs to send updates to objects representing individual stocks
    * The Subject (publisher) sends many stocks to the Observers
    * The Observers (subscribers) takes the ones they want and use them
  * Mailing List:
    * In a mailing list, where every time an event happens:
      * New submission
      * New review is posted
    * Message is sent to the people subscribed to the list

## Run the program
To execute the program from command line, please use the following command:

```
javac ObserverDesignPattern.java
java ObserverDesignPattern
```

## Exercise
* In this example, `BreakingNewsFeed` allows varies cable news companies (e.g. CNN, Fox, NBC, and etc) to subscribe for
any news alerts
* When there is a breaking news is set in the `BreakingNewsFeed`, it notifies all of its subscribers of that breaking
news
* Please fill in the `____________________`  blanks to make the program run successfully to follow Observer Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `ObserverDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
CNN Breaking News: UK votes to leave EU
Fox Alert: UK votes to leave EU

CNN Breaking News: Dow Jones set new record
Fox Alert: Dow Jones set new record
NBC Breaking News: Dow Jones set new record
```
