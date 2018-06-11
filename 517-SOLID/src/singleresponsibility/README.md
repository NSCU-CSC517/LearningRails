# Single Responsibility Principle

## Overview of Principle

* A class should have only one reason to change.

That is, although an object could represent one logical item, a single class should not have more than one major function of set of functions. Sometimes, several classes representing a single logical object is a better fit, as each can represent a single major piece of functionality

## "Bad" Example

Main class: CityMap

In this example, the CityMap class represents a map consisting of a list of cities with various attributes. Although this represents a single logical object, the CityMap class takes on several very separate pieces of functionality which should, according to this principle, be divided into several classes. Those functionalities include managing the list of cities (add and remove), drawing the map on the screen, and calculating the total population

## "Good" Example ideas

The good example could simply consist of splitting this functionality into several smaller classes. For example, "CityList" and "MapView". I would like to simplify the bad example if possible beforehand, however, as it is most likely possible to demonstrate the principle with fewer lines of code. 