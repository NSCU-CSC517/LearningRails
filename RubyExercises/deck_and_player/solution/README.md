# Deck and Player Exercise in Ruby
This exercise is designed to implement playing game "Blackjack".

It involves [Array](https://ruby-doc.org/core-1.9.3/Array.html) and
[Enumerable](https://ruby-doc.org/core-2.5.1/Enumerable.html). Please look them up if you get stuck.

## Description
* Please read and follow [instructions](https://docs.google.com/document/d/1ntqlNa-nY5eWrzi021HB5wpbmVzDgiH38cHAb-ygNAc/edit?usp=sharing)
for this exercise.
* It consists of six (6) parts:
  * *a, b, c, d, e, f*
* It is expected to take sometime to perform this exercise.

## Run the program
To execute the program from command line, please use the following commands:

```
ruby deck_and_player.rb
```

## Exercise
* Please fill in the `____________________` blanks to make the program run successfully and see if you can hit
Blackjack!! (or you may lose, try and see)
* Every time the answer contains a block, please use `x`, `y`, `z`, in that order, as parameter(s).
* **DO NOT** include any unnecessary blanks in the block.
  * Example (no blanks): `a.inject{|x,y|x+y}`
* If you wish not to arrange the deck and rather draw random cards from the deck, please comment out following line in
the code (towards end of the file):
  * `deck.arrange_cards`

## Expected Output
Upon executing the program, you should see following output (assuming all the blanks are filled in correctly and
`deck.arrange_cards` statement was not commented out):

```
2 cards in hand:
The 1 of clubs
The 2 of clubs
The total points are 3.

6 cards in hand:
The 1 of clubs
The 2 of clubs
The 3 of clubs
The 4 of clubs
The 5 of clubs
The 6 of clubs
The total points are 21.

Your final points are 21.
You hit the blackjack! :)
```
