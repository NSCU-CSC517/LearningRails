# Single Responsibility Principle

## Overview of Principle

* A class should have only one reason to change.

That is, although an object could represent one logical item, a single class should not have more than one major function of set of functions. Sometimes, several classes representing a single logical object is a better fit, as each can represent a single major piece of functionality

## "Bad" Example

Main class: CityMap

In this example, the CityMap class represents a map consisting of a list of cities with various attributes. Although this represents a single logical object, the CityMap class takes on several very separate pieces of functionality which should, according to this principle, be divided into several classes. Those functionalities include managing the list of cities (add and remove), drawing the map on the screen, and calculating the total population

## "Good" Example

The good example simply splits the CityMap class into two classes - Map and CityList. CityList maintains the ArrayList of cities and also allows calculating the total population. The Map class focuses solely on drawing the map on a screen. This fixes the issues with the "Bad" example, as each class now focuses solely on operations related to one set of data.