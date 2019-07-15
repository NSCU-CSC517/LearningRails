# Flyweight Design Pattern Exercise in Ruby

## Description
* Flyweight Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Re-uses shared objects that are similar in some way instead of creating new ones.
* Dramatically increases the speed of the code whenever shared objects are re-used instead of dealing with distinct
objects in memory.
* Reduces the cost of complex object models.
* Reduces memory usage and saves memory: 
  * Shared objects already created
  * Does not require allocation of additional memory
  * Mitigates utilization of memory
    * Swapping of objects in memory
* Promotes sharing of states:
  * Intrinsic  State:
    * That is what shared by many objects
  * Extrinsic State
* Creates new object only if the object to be used has "new" (non-common) intrinsic state.
* It allows:
  * Save memory
  * Reduce machine resources:
    * Complexity and Cost of creating new object(s)
    * Memory utilization
* It is used when:
  * There is a need to create a large number of similar objects
  * Sharing to support large numbers of fine-grained objects efficiently
  * Need to reduce memory usage
* Example(s):
  * Testing a system by feeding large number of objects with the same properties:
    * There is a need for N number of objects for an adequate system test
    * Create only M << N number objects that have different intrinsic state
    * System treats each shared objects as completely separate object as long as it shares the same intrinsic state
    * If intrinsic state changes, it requires creation of a new object
  * Displaying large number of Squares on the user screen:
    * There is a need to display N number of Squares on the screen that vary only by color:
      * There are M << N different colors
    * Create only M Squares:
      * 1 per different color
    * Keep re-using M Squares for displaying N number of squares on the screen
    * User sees no difference whether each Square is separate object in memory or if it is the same shared object

## Run the program
To execute the program from command line, please use the following command:

```
ruby flyweight_design_pattern1.rb
```

## Exercise
* In this example, Flyweight Design Pattern is created to re-use the same `Tree` objects and store it into the List.
* There are only two types of the `Tree` object:
  * Oak Tree
  * Flowering Cherry
* Intrinsic state of each type of the tree is the same:
  * Each Oak Tree object has the same properties
  * Each Flowering Cherry has the same properties
* Program calls `TreeSelector` to get a "new" `Tree` object:
  * Depending on the type, if `OakTree` or `FloweringCherry` object has already been created, it returns it
  * If not, it creates new object, stores into memory, and returns it
* Hence, there are only 2 real objects in memory (`OakTree` and `FloweringCherry` objects).
* Once the list is filled with (shared) objects, program changes intrinsic state of random Oak Tree object in the list:
  * Since this is only single object that is shared in that list
  * As a result all Oak Tree objects in the list have changed their intrinsic state
* This Flyweight Design Pattern is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Flyweight Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `flyweight_design_pattern1.rb` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Oak Tree ~~ Height: 70  Flowers: false  Fruits: false  Root Depth: 2  Forest Type: Deciduous
Oak Tree ~~ Height: 70  Flowers: false  Fruits: false  Root Depth: 2  Forest Type: Deciduous
Oak Tree ~~ Height: 70  Flowers: false  Fruits: false  Root Depth: 2  Forest Type: Deciduous
Flowering Cherry ~~ Height: 20  Flowers: true  Fruits: false  Flower Color: Pink
Flowering Cherry ~~ Height: 20  Flowers: true  Fruits: false  Flower Color: Pink
Flowering Cherry ~~ Height: 20  Flowers: true  Fruits: false  Flower Color: Pink

Changing property of a single Tree instance from the list at index 0
Changing Oak Tree property Forest Type to Evergreen

Oak Tree ~~ Height: 70  Flowers: false  Fruits: false  Root Depth: 2  Forest Type: Evergreen
Oak Tree ~~ Height: 70  Flowers: false  Fruits: false  Root Depth: 2  Forest Type: Evergreen
Oak Tree ~~ Height: 70  Flowers: false  Fruits: false  Root Depth: 2  Forest Type: Evergreen
Flowering Cherry ~~ Height: 20  Flowers: true  Fruits: false  Flower Color: Pink
Flowering Cherry ~~ Height: 20  Flowers: true  Fruits: false  Flower Color: Pink
Flowering Cherry ~~ Height: 20  Flowers: true  Fruits: false  Flower Color: Pink
```
