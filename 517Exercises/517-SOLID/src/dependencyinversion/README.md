# Dependency Inversion Principle

## Overview of Principle

* "High-level modules should not depend on low-level modules. Both should depend on abstractions."

* "Abstractions should not depend on details. Details should depend on abstractions."

That is, as much as possible, classes should not be concerned with the implementation details of other classes, especially if functionality is not directly related.

## "Bad" Example
Main Class: Bank

In this example, a Bank class (representing, well, a Bank) is a high-level class with complex functionality (redacted for this example). One piece of that functionality is handling transactions between various accounts (simple, low-level classes). The Bank, however, is very tightly coupled with the CheckingAccount and SavingsAccount classes. Adding additional account types (such as a MoneyMarketAccount, InvestmentAccount, or RetirementAccount) would exponentially increase the complexity of Bank.

## "Good" Example
Main Class: Bank (High Level) / Accounts (Low Level)

To correct the above issues, a layer of abstraction between the various types of accounts and the high-level Bank class is added. In this case, a simple BasicAccount interface is added between the layers. Although each account may process transactions in different ways (for example, Federal Reserve Regulation D requires that savings accounts limit the number of transactions per month, but this does not apply to Checking accounts), a simple, uniform interface can be provided. This dramatically simplifies the Bank class, and will allow for new types of accounts to be added easily.

As discussed, an argument could be made to make BasicAccount an abstract class. In this limited example, this would actually simplify the codebase, by allowing the repeated code found in various versions of deposit() and withdraw() to be moved to a single location. In that setup, classes which require checks/validation before accepting a deposit or withdraw could make those and then delegate to the abstract class. However, in a more complete system, there may very well be scenarios where this structure would not work (for example, HSA/IRA/Business/Credit accounts may have very different deposit or withdrawal structures). Therefore, the class is left as an interface, as that structure makes the example more clear (it is essential to clarify the interface as existing primarily as a layer between Bank and the Account classes).

## Fill-in-the-blank answers

1. BasicAccount
2. BasicAccount
3. getBalance
4. withdraw
5. BasicAccount
6. withdraw
7. BasicAccount
8. withdraw 