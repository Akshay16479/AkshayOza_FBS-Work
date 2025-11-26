Banking Management System
1. Overview

This is a console-based Java Banking Management System that simulates real-world banking operations. It allows users to manage accounts, deposits, withdrawals, loans, interest, and transactions.

The system uses Object-Oriented Programming (OOP) principles:

Encapsulation – Private fields with getters/setters

Inheritance – Account types extend BankAccount

Abstraction – BankAccount abstract class with common methods

Polymorphism – Account operations through interface AccountOperation

Supported Account Types:

Saving Account

Current Account

Salary Account

Loan Account

2. Classes & Interfaces
2.1 Bank

Represents the bank branch and basic details.
Attributes:

branchId, bankName, branchName

bankLocation, totalAccountcount, IfscCode

Constructors:

Default constructor – initializes default bank

Parameterized constructor – allows custom initialization

Methods:

Getters and setters

toString() – prints bank details

2.2 Transaction

Represents a bank transaction for each account.

Attributes:

transactionId, transactionDate, transactionType

amount, updatedBalance

Methods:

Constructor for initialization

Getters for each field

toString() – displays transaction information

2.3 AccountOperation (Interface)

Defines the contract for all accounts.

Methods:

deposit(double amount)

withdraw(double amount)

showDetails()

Getters & Setters for accountNumber, accountHolderName, balance

2.4 BankAccount (Abstract Class)

Implements AccountOperation and provides common functionality for all accounts.

Attributes:

accountNumber, accountHolderName, balance

accountHolderAadhar, nomineeAadhar

accountStatus (Active/Inactive)

transactions[] and transactionCount

Methods:

Abstract withdraw()

Concrete deposit(), showDetails(), addTransaction()

Getters & Setters for all fields

3. Account Types
3.1 SavingAccount

Minimum Balance: 10,000

Interest Rate: 8% (static)

Allows deposits and withdrawals while maintaining minimum balance

Tracks interest transactions

3.2 CurrentAccount

Minimum Balance: 7,000

Overdraft Limit: Customizable

Supports deposit and withdrawal with overdraft facility

3.3 SalaryAccount

Interest Rate: 4.5% (static)

Automatically freezes account after 2 months of inactivity

Allows deposits and withdrawals

Tracks last transaction date

3.4 LoanAccount

Supports loan repayment only

Cannot withdraw funds

Keeps track of loan amount and outstanding balance

4. Functionalities

Create Account – Saving, Current, Salary, Loan

Deposit – Add money to account

Withdraw – Withdraw money according to rules

Display Account Details – Single account info

Display All Accounts – Show all accounts and balances

Transaction History – View all transactions of an account

Calculate Interest – Apply interest automatically for saving accounts

End-of-Day Report – Summary of all accounts

Exit – Close application

5. System Flow

User sees menu

Choose operation

For Create Account:

Select account type

Enter name, balance, Aadhar, nominee

System assigns unique account number

For Deposit/Withdraw:

Enter account number

Enter amount

Transaction is recorded

For Display or Transaction History:

View account info or transactions

End-of-Day Report:

Shows all accounts with balances

6. End-of-Day Reporting

Total accounts

Account number and current balance for each account

7. Transaction Management

Each account maintains a Transaction[] array

Types of transactions:

Deposit

Withdraw

Loan Repayment

Interest

Transactions can be viewed individually
