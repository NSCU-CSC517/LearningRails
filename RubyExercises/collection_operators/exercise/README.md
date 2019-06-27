# Collection Operators Exercise in Ruby

## Description
* This exercise utilizes various Collection Operators in Ruby.
* Ruby's Array class contains many methods for treating arrays as collections.
  * `collect`
    * Applied to an array with a block as parameter, it returns a new array that consists of the results of applying the
    block to each element of the array
  * `select`
  * `reverse` and etc.

## Run the program
To execute the program from command line, please use the following commands:

```
ruby collection_operators.rb
```

## Exercise
* Please fill in the `____________________` blanks to make the program run successfully and get expected output.
* Please call only one collection operator on `a = ['a','b','c','d']` or `b = [1,2,3,4]` to get the expected outputs
  * Without changing `a` nor `b`
* Every time the answer contains a block, please use `x, y, z`, in that order, as parameter(s)
* **DO NOT** include any unnecessary blanks in the block.
  * Example (no blanks): `a.inject{|x,y|x+y}`

## Expected Output
Upon executing the program, you should see the following output (assuming all the blanks are filled in correctly):

```

[1, 2, 3, 4, "a", "b", "c", "d"]
[2, 3]
[4, 3, 2, 1]
[2, 3, 4, 5]
["b", "c", "d", "a"]
["aa", "bb", "cc", "dd"]
```
