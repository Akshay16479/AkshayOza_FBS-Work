Banking Management System
Overview

This is a console-based Java Banking Management System designed to simulate real-world banking operations such as account creation, deposits, withdrawals, loan management, interest calculation, and transaction tracking. The system uses Object-Oriented Programming (OOP) concepts like inheritance, abstraction, interfaces, polymorphism, and encapsulation.

The application supports multiple types of bank accounts: Saving Account, Current Account, Salary Account, and Loan Account.

Table of Contents

Classes & Interfaces

Account Types

Functionalities

How to Run

System Flow

End-of-Day Reporting

Transaction Management

Classes & Interfaces
1. Bank

Represents the bank entity with details like branch ID, name, location, total accounts, and IFSC code.

Attributes:

branchId

bankName

branchName

bankLocation

totalAccountcount

IfscCode

Constructors:

Default constructor (initializes default bank)

Parameterized constructor (custom initialization)

Methods:

Getter and Setter methods for all attributes

toString() for printing bank details

2. Transaction

Represents a bank transaction. Each account can store multiple transactions.

Attributes:

transactionId

transactionDate

transactionType (Deposit, Withdraw, Repayment, Interest)

amount

updatedBalance

Methods:

Constructor to initialize transaction

Getter methods

toString() for displaying transaction details

3. AccountOperation (Interface)

Defines the contract for bank accounts.

Methods:

deposit(double amount)

withdraw(double amount)

showDetails()

Getters & Setters for account number, account holder name, and balance

4. BankAccount (Abstract Class)

Implements the AccountOperation interface. Provides common behavior for all account types.

Attributes:

accountNumber, accountHolderName, balance

accountHolderAadhar, nomineeAadhar

accountStatus (active/inactive)

transactions[] and transactionCount

Methods:

Abstract withdraw()

Concrete deposit(), showDetails(), addTransaction()

Getters and Setters for common attributes

Account Types
1. SavingAccount

Minimum Balance: 10,000

Interest Rate: 8% (static)

Allows deposits and withdrawals while maintaining minimum balance

Tracks interest transactions

2. CurrentAccount

Minimum Balance: 7,000

Overdraft Limit: Customizable

Supports deposit and withdrawal with overdraft facility

3. SalaryAccount

Interest Rate: 4.5% (static)

Automatically freezes accounts inactive for more than 2 months

Allows deposits and withdrawals

4. LoanAccount

Supports loan repayment only

Cannot withdraw funds

Keeps track of loan amount and outstanding balance

Functionalities

Create Account – Choose from Saving, Current, Salary, or Loan accounts.

Deposit – Add money to the selected account.

Withdraw – Withdraw money based on account rules (minimum balance, overdraft, loan restrictions).

Display Account Details – Show all information of a single account.

Display All Accounts – List all accounts with balances.

Transaction History – View all transactions for a selected account.

Calculate Interest – Apply interest automatically for saving accounts.

End-of-Day Report – Summary of all accounts and balances.

How to Run

Clone or download the repository.

Compile all .java files in a single package (practiceworkjava).

javac *.java


Run the Test class:

java practiceworkjava.Test


Follow the console menu for operations.

System Flow
1. User sees menu
2. Choose action: Create, Deposit, Withdraw, Display, Transactions, Interest, Report, Exit
3. For Create Account:
    - Select account type
    - Enter name, balance, Aadhar, nominee
    - Account is created with unique account number
4. For Deposit/Withdraw:
    - Enter account number
    - Enter amount
    - Transaction is added
5. Display or Transaction History:
    - Shows account details or transaction list
6. End-of-Day Report:
    - Summary of all accounts

End-of-Day Reporting

Displays total number of accounts

Shows account number and balance for each account

Transaction Management

Each account maintains an array of Transaction objects

Transactions include:

Deposit

Withdraw

Loan Repayment

Interest

Transactions can be viewed individually for each account
