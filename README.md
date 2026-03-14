# ATM Machine Simulation (Java)

A **console-based ATM machine simulation** built using **Java and Object-Oriented Programming (OOP)** concepts.
The program allows users to perform basic banking operations such as depositing money, withdrawing money, and checking account balance through a menu-driven interface.

## Features

* Deposit money into the account
* Withdraw money with balance validation
* Check current account balance
* Menu-driven user interface using `Scanner`
* Prevents withdrawal when balance is insufficient

## Technologies Used

* Java
* OOP Concepts
* Git & GitHub

## OOP Concepts Implemented

* **Interfaces** – `ATMoperations` defines the banking operations
* **Encapsulation** – balance is stored as a private variable inside the ATM class
* **Abstraction** – interface hides implementation details
* **Polymorphism** – interface reference used to access ATM methods

## Project Structure

ATM-Machine
│
├── ATMoperations.java
├── ATMmachine.java

## How to Run the Program

1. Clone the repository
git clone https://github.com/ved-1046/ATM---Machine.git

2. Open the project in any Java IDE (IntelliJ, VS Code, Eclipse)

3. Compile and run:


javac ATMmachine.java
java ATMmachine


## Example Menu
------------MENU------------
1. DEPOSIT
2. WITHDRAW
3. CHECK BALANCE
4. EXIT

## Future Improvements
* Add **PIN authentication**
* Add **transaction history**
* Add **daily withdrawal limit**
* Support **multiple user accounts**

## Author

Vedika Tamshetti
Computer Engineering Student | Java • OOP • DSA
