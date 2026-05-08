# ATM Machine Simulation (Java)

A console-based ATM machine simulation built using Java and Object-Oriented Programming (OOP) concepts.
This project allows users to perform basic banking operations such as depositing money, withdrawing money, and checking account balance using a PIN-based authentication system.

---

## Features

* PIN-based user authentication
* Deposit money into the account
* Withdraw money with balance validation
* Check current account balance
* Exception handling for invalid inputs
* Menu-driven interface using `Scanner`

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Exception Handling
* Git & GitHub

---

## OOP Concepts Implemented

* Interfaces – `ATMoperations` defines core banking methods
* Encapsulation – Balance and PIN are private inside the `ATM` class
* Abstraction – Interface hides implementation details
* Polymorphism – Interface reference used to access methods

---

## Project Structure

```
ATM-Machine/
│
├── ATMoperations.java
├── ATMmachine.java
```

---

## How to Run the Program

1. Clone the repository 

```
git clone https://github.com/ved-1046/ATM---Machine.git
```

2. Navigate to the project folder

```
cd ATM---Machine
```

3. Compile the program

```
javac ATMmachine.java
```

4. Run the program

```
java ATMmachine
```

---

## Example Output

```
===== ATM MACHINE =====
Enter PIN: 1234

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

---

## Error Handling

* Prevents deposit/withdrawal of invalid amounts
* Displays message for insufficient balance
* Handles incorrect PIN entry
* Detects invalid input types

---

## Future Improvements

* Add transaction history
* Implement multiple user accounts
* Add daily withdrawal limits
* Store data using files or database
* Develop a GUI version using Java Swing or JavaFX

---

## Author

Vedika Tamshetti
Computer Engineering Student
JAVA & OOPs concept
