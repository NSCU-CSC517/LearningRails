# Interface Segregation Examples

## Overview of principle

* "Clients should not be forced to depend on interfaces they do not use"
* "Many client-specific interfaces are better than one general-purpose interface"

In short, it is often easy to create one general-purpose interface, and have several classes implement this interface. Issues can arise when different classes need different pieces of functionality published through that interface.

## "Bad" Example
In this example, a single interface, "Vehicle" is created, for two classes, "Sedan" and "Truck". This is on the surface a logical structure. However, in this case, the methods loadTrunk() and loadTruckbed(), published in the Vehicle interface, are not used by both clients (As a Truck does not have a trunk, and a Sedan does not have a Truckbed). Because of this mismatch, the Sedan is forced to throw an UnsupportedOperationException when loadTruckbed is called on it, and Truck is forced to throw an UnsupportedOperationException when loadTrunk is called on it. This demonstrates a violation of the Interface Segregation principle, as a single, logical but ill-fitting interface is used by several clients, despite clear incompatibilities.
