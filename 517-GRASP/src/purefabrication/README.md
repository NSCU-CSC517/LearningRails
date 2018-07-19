# Pure Fabrication / Service

## Overview of Principle

-  "You must assign a responsibility to a class, but assigning it to a class that represents a conceptual model entity would ruin its low coupling or high cohesion. You resolve this problem by fabricating a class that does not represent an entity in your conceptual model." Patterns in Java, Vol. 2, p 73.

-  " Assign a highly cohesive set of responsibilities to an artificial or convenience class that does not represent a problem domain concept -- something made up, to support high cohesion, low coupling, and reuse" - Larman

This principle seeks to maintain low coupling and high cohesion. Often, you can run into a situation where a class is performing several unrelated tasks when attempting to follow the Information Expert idea. For example, a 'Sale' class can keep track of a record of a sale as well as the saving of this record to the DB. This results in low internal cohesion and low code re-use (saving a record to a DB is a fairly generic task). Introducing an intermediate, 'made-up' class to handle object storage would, in this case, reduce coupling and increase cohesion.

## Example

In this example, an Event class keeps track of events recorded by a logging system. According to Information Expert, we may want to have the Event class also handle saving an event to the DB. However, this is logically a separate task, and any code used to save an Event cannot be re-used. Therefore, we could create an EventStorage class which handles storing events. Storage is more of a task than an idea in the domain model, hence its existance as a Service or Pure Fabrication. This is also useful as certain classes may want to create Events while different ones may want to handle saving them.

### Fill-in-the-blank answers
1. Event
2. Event
3. saveToDB
4. Event
5. Event
6. saveToDB
7. Event
8. Event
9. saveToDB




