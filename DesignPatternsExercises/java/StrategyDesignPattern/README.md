# This is Strategy Design Pattern Exercise in Java
## Description
* In this example, extraction system for 3 types of files is created, but incomplete.
* You need to fill in the '____________________' blanks to complete the code.
* Start with StrategyPatternExample.java file.

## Run the program
To execute the program from command line, please run the following commands:
```
javac StrategyPatternExample.java
java StrategyPatternExample
```

## What needs to be done
* Please fill-in the '____________________'  blanks to make the program run successfully to follow Design Pattern
* Check each file for blanks
* Enter missing statements (blanks) into Google Doc Exercise

## Expected Output
Upon executing the program, you should see the following output:

```
Select one of the data types (d-Database/c-CSV/t-TSV): 
```

The program then prompts the user to enter desired data type by a single letter (e.g., 'd', 'c', or 't').
The following is sample output of each run with different data type.

* For option 'd'
```
Select one of the data types (d-Database/c-CSV/t-TSV): 
d
Opening database file
DB: I will extract by reading rows and columns
Closing database file
```

* For option 'c'
```
Select one of the data types (d-Database/c-CSV/t-TSV): 
c
Opening CSV file
CSV: I will extract by separating row by commas.
Closing CSV file
```

* For option 't'
```
Select one of the data types (d-Database/c-CSV/t-TSV): 
t
Opening TSV file
TSV: I will extract by separating row by tabs.
Closing TSV file
```
