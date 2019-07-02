# Pure Fabrication / Service Exercise in Java

## Description
* Pure Fabrication / Service concept is reviewed in this example and exercise.
* "You must assign a responsibility to a class, but assigning it to a class that represents a conceptual model entity
would ruin its low coupling or high cohesion. You resolve this problem by fabricating a class that does not represent an
entity in your conceptual model." Patterns in Java, Vol. 2, p 73.
* " Assign a highly cohesive set of responsibilities to an artificial or convenience class that does not represent a
problem domain concept -- something made up, to support high cohesion, low coupling, and reuse" - Larman
* This principle seeks to maintain low coupling and high cohesion.
* Possibility of a class performing several unrelated tasks when attempting to follow the Information Expert idea.
* Example:
  * 'Sale' class can keep track of a record of a sale as well as the saving of this record to the DB
  * This results in low internal cohesion and low code re-use (saving a record to a DB is a fairly generic task)
  * Introducing an intermediate, 'made-up' class to handle object storage would, in this case, reduce coupling and
  increase cohesion

## Run the program
To execute the program from command line, please use the following commands:
```
javac PureFabrication.java
java PureFabrication
```

## Exercise
* In this example, an `Event` class keeps track of events recorded by a logging system.
* According to Information Expert, it is possible to have the Event class also handle saving an event to the DB:
  * However, this is logically a separate task, and any code used to save an `Event` cannot be re-used.
  * Therefore, it is possible to create an `EventStorage` class which handles storing events.
* Storage is more of a task than an idea in the domain model, hence its existence as a Service or Pure Fabrication:
  * Advantage of certain classes create `Events` while others handle saving them.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Factory Method Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `PureFabrication.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming all blanks are filled in correctly):

```
INSERT INTO events (date, server, desc)
VALUES ( Mon Jul 01 21:56:36 EDT 2019,Server 1,Turned on server);
INSERT INTO events (date, server, desc)
VALUES ( Mon Jul 01 21:56:36 EDT 2019,Server 1,Started webapp);
INSERT INTO events (date, server, desc)
VALUES ( Mon Jul 01 21:56:36 EDT 2019,Server 1,New connection!);
```
