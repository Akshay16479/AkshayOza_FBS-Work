Banking Application (MVC Structure)
📌 Overview

This is a Banking Management System implemented in Java using the MVC (Model-View-Controller) architecture.

The application allows users to:

Create different types of bank accounts: Saving, Current, Salary, Loan

Deposit and withdraw money

View account details and transaction history

Calculate interest for savings accounts

Generate end-of-day reports

The project separates data models, business logic, and user interface for clean and maintainable code.

📌 Features

Create accounts for Saving, Current, Salary, and Loan types

Deposit and withdraw money with rules (minimum balance, overdraft, loan repayment)

Track transactions for each account

Display single account or all accounts

Calculate interest for Saving Accounts

Freeze salary accounts automatically after 2 months of inactivity

Generate End-of-Day Reports

📌 Folder Structure & Files
Folder / File	Description
model/Bank.java
	Bank branch information and details
model/Transaction.java
	Transaction data for accounts
model/AccountOperation.java
	Interface for account operations (deposit, withdraw, etc.)
model/BankAccount.java
	Abstract base class for all accounts
model/SavingAccount.java
	Saving account implementation
model/CurrentAccount.java
	Current account implementation
model/SalaryAccount.java
	Salary account implementation
model/LoanAccount.java
	Loan account implementation
view/BankView.java
	Console-based menu and output display
controller/BankController.java
	Handles program logic and connects Model with View
Test.java
	Main entry point to run the program
📌 MVC Breakdown

Model: Classes representing the bank, accounts, and transactions.

View: Handles console-based user interface and menu displays.

Controller: Contains all program logic, connecting Model and View.

📌 How to Run

Open the project in Eclipse/IntelliJ or any Java IDE.

Ensure all files are inside the practiceworkjava package.

Compile and run Test.java
.

Use the console menu to interact with the application.

📌 Usage Example

Run the program → Menu is displayed

Choose 1 → Create a new account

Choose 2 → Deposit money

Choose 3 → Withdraw money

Choose 4 → Display account details

Choose 5 → Display all accounts

Choose 6 → View transaction history

Choose 7 → Calculate interest (Saving Accounts)

Choose 8 → Generate end-of-day report

Choose 9 → Exit

📌 Notes

Accounts are stored in an array

Each account maintains its transaction history

Interest applies only to Saving Accounts

Salary accounts freeze automatically after 2 months of inactivity..
