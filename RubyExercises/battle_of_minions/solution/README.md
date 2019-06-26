# Comparable Exercise in Ruby: Battle of Minions

## Description
* This exercise utilizes Comparable in Ruby, but is done via simple game called Battle of Minions.
* Suppose in a game, players can summon their minions to battle.
* Every minion has four (4) attributes:
  * name
  * atk
  * defense
  * HP 
* The rules for a turn-based battle of 2 minions are:
  1. On each turn, the damage that one minion does to the other minion is equal to its atk minus the other's defense.
  And after several turns, the one whose HP first drops to (or below) zero (0) loses. If both HPs drop to (or below)
  zero (0) in the same turn, they tie.
  2. If the atk of minion A is less than or equal to the defense of minion B, minion B automatically wins.
  3. If both atk's are less than or equal to the other's defense, they automatically tie.
* Assume that minion A > minion B means minion A defeats minion B, minion A < minion B means minion B defeats minion A
and minion A == minion B means they tie.

## Run the program
To execute the program from command line, please use the following commands:

```
ruby battle_of_minions.rb
```

## Exercise
* Please complete the method <=>(other) in Minion class to implement the battle of two (2) minions.
* Please fill in the `____________________` blanks to make the program run successfully and see who wins the battle!

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```
rider
```
