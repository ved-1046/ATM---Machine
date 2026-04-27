import java.util.Scanner;


class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

interface ATMoperations {
    void deposit(double amount) throws InvalidInputException;
    void withdraw(double amount) throws InvalidInputException;
    void checkBalance();
}

class ATM implements ATMoperations {

    private double balance = 10000;
    private int PIN = 1234;

    public boolean checkPin(int pin) {
        return this.PIN == pin;
    }

    public void deposit(double amount) throws InvalidInputException {
        if (amount <= 0) {
            throw new InvalidInputException("Deposit amount must be greater than 0");
        }
        balance += amount;
        System.out.println("Amount deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InvalidInputException {
        if (amount <= 0) {
            throw new InvalidInputException("Withdrawal amount must be greater than 0");
        } else if (amount > balance) {
            throw new InvalidInputException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMmachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("===== ATM MACHINE =====");

        try {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (!atm.checkPin(pin)) {
                System.out.println("Wrong PIN! Access Denied.");
                return;
            }

            while (true) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        double d = sc.nextDouble();
                        atm.deposit(d);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double w = sc.nextDouble();
                        atm.withdraw(w);
                        break;

                    case 3:
                        atm.checkBalance();
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        return;

                    default:
                        throw new InvalidInputException("Invalid menu choice!");
                }
            }

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input type!");
        } finally {
            sc.close();
            System.out.println("Session Ended.");
        }
    }
}
