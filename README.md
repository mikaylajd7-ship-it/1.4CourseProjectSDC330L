# Bank Database Application

## Overview

The Bank Database Application is a Java console program that allows users to create and manage bank accounts using a local SQLite database. The application demonstrates object-oriented programming concepts such as abstraction, inheritance, polymorphism, interfaces, composition, and database connectivity.

Users can:

* Add new bank accounts
* View all accounts
* Deposit money into an account
* Withdraw money from an account
* Delete an account

All account data is stored in an SQLite database file named `MikaylaDickerson.db`.

---

## Author

**Mikayla Dickerson**
Date: May 3, 2026

---

## Features

### Account Management

* Create checking or savings accounts
* Store account owner name, balance, and account type
* View all existing accounts
* Update balances with deposits and withdrawals
* Delete accounts by ID

### Database Integration

* Uses SQLite for persistent data storage
* Automatically creates the `Accounts` table if it does not exist

### Object-Oriented Programming Concepts Demonstrated

* **Abstraction** using the abstract `Account` class
* **Inheritance** with `CheckingAccount` and `SavingsAccount`
* **Polymorphism** through overridden methods and interface references
* **Interfaces** with `BankOperations`
* **Composition** with the `Bank` class containing a collection of accounts
* **Encapsulation** using private fields and public getters

---

## Project Structure

```text
4.2/
├── App.java
├── Account.java
├── CheckingAccount.java
├── SavingsAccount.java
├── Bank.java
├── BankOperations.java
├── BankDB.java
├── MikaylaDickerson.db
├── lib/
│   └── sqlite-jdbc-3.53.0.0.jar
├── App.class
├── Bank.class
├── CheckingAccount.class
└── SavingsAccount.class
```

---

## Class Descriptions

### App.java

The main program entry point. Displays the menu and handles user interaction.

### Account.java

Abstract base class for all account types.

Fields:

* `owner`
* `balance`

Methods:

* `deposit()`
* `withdraw()`
* `displayAccountInfo()`
* `monthlyUpdate()` (abstract)

### CheckingAccount.java

Extends `Account`. Applies a monthly service fee of $10.

### SavingsAccount.java

Extends `Account`. Adds $25 in monthly interest.

### BankOperations.java

Interface defining:

* `deposit(double amount)`
* `withdraw(double amount)`

### Bank.java

Demonstrates composition by maintaining an `ArrayList<Account>`.

### BankDB.java

Handles all SQLite database operations.

Methods:

* `createTable()`
* `addAccount()`
* `getAllAccounts()`
* `updateBalance()`
* `deleteAccount()`

---

## Database Schema

### Accounts Table

| Column  | Type    | Description                 |
| ------- | ------- | --------------------------- |
| id      | INTEGER | Primary key, auto-increment |
| owner   | TEXT    | Account owner's name        |
| balance | REAL    | Current account balance     |
| type    | TEXT    | Checking or Savings         |

---

## Requirements

### Software

* Java JDK 17 or later
* SQLite JDBC Driver (`sqlite-jdbc-3.53.0.0.jar`)
* Visual Studio Code or another Java IDE

---

## How to Compile

### Windows Command Prompt

```bash
javac -cp ".;lib/sqlite-jdbc-3.53.0.0.jar" *.java
```

### PowerShell

```powershell
javac -cp ".;lib/sqlite-jdbc-3.53.0.0.jar" *.java
```

### macOS/Linux

```bash
javac -cp ".:lib/sqlite-jdbc-3.53.0.0.jar" *.java
```

---

## How to Run

### Windows

```bash
java -cp ".;lib/sqlite-jdbc-3.53.0.0.jar" App
```

### macOS/Linux

```bash
java -cp ".:lib/sqlite-jdbc-3.53.0.0.jar" App
```

---

## Sample Program Output

```text
Week 4 Project - Bank Database Application
Mikayla Dickerson
This program stores bank accounts using SQLite.
You can create, view, update, and delete accounts.

--- MENU ---
1. Add Account
2. View Accounts
3. Deposit
4. Withdraw
5. Delete Account
6. Exit
```

---

## Example Usage

### Add an Account

1. Select option `1`
2. Enter the owner's name
3. Enter the starting balance
4. Enter the account type (`Checking` or `Savings`)

### Deposit Funds

1. Select option `3`
2. Enter the account ID
3. Enter the deposit amount

### Withdraw Funds

1. Select option `4`
2. Enter the account ID
3. Enter the withdrawal amount

### Delete an Account

1. Select option `5`
2. Enter the account ID

---

## Learning Objectives

This project was created to demonstrate:

* Java class design
* Abstract classes and interfaces
* Inheritance and method overriding
* Database programming with JDBC
* CRUD operations
* User input handling with `Scanner`

---

## Known Limitations

* Withdrawals made directly through the database do not validate available funds.
* Input validation is minimal.
* Monthly update methods are not currently called by the menu.
* Database resources are not explicitly closed.

---

## Possible Enhancements

* Add input validation for invalid menu entries
* Prevent overdrafts in the database layer
* Add account search by owner name
* Add transfer between accounts
* Close database connections safely
* Implement monthly updates through a menu option

---

## License

This project was created for educational purposes as part of a Java programming course.

---

## Contact

**Mikayla Dickerson**

For questions about this project, contact the author through your course platform or GitHub repository.
