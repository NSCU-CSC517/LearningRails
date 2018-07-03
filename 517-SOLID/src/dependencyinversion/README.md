# Dependency Inversion Principle

## Overview of Principle

* "High-level modules should not depend on low-level modules. Both should depend on abstractions."

* "Abstractions should not depend on details. Details should depend on abstractions."

That is, as much as possible, classes should not be concerned with the implementation details of other classes, especially if functionality is not directly related.

## "Bad" Example
Main Class: Bank

In this example, a Bank class (representing, well, a Bank) is a high-level class with complex functionality (redacted for this example). One piece of that functionality is handling transactions between various accounts (simple, low-level classes). The Bank, however, is very tightly coupled with the CheckingAccount and SavingsAccount classes. Adding additional account types (such as a MoneyMarketAccount, InvestmentAccount, or RetirementAccount) would exponentially increase the complexity of Bank.

## "Good" Example
Main Class: Bank / Account

To correct the above issues, a layer of abstraction between the various types of accounts and the high-level Bank class is added. In this case, a simple BasicAccount interface is added between the layers. Although each account may process transactions in different ways (for example, US Regulation D requires that savings accounts limit the number of transactions per month, but this does not apply to Checking accounts), a simple, uniform interface can be provided. This dramatically simplifies the Bank class, and will allow for new types of accounts to be added easily. 