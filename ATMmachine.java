import java.util.Scanner;

interface ATMoperations{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();

}

class ATM implements ATMoperations{

    private double balance = 10000;
    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("The amount deposited is : " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(balance < amount){
            System.out.println("Insufficient Balance");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawn amount is : " + amount);
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }
}


public class ATMmachine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ATMoperations atm = new ATM();

        while (true){
            System.out.println("------------MENU------------");
            System.out.println("1.DEPOSIT");
            System.out.println("2.WITHDRAW");
            System.out.println("3.CHECK BALANCE");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the amount to deposit");
                    int amount = sc.nextInt();
                    atm.deposit(amount);

                    break;

                case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    int withdraw = sc.nextInt();
                    atm.withdraw(withdraw);
                    break;


                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thankyou for using ATM machine");
                    return;

                default:
                    System.out.println("Invalid choice entered");
            }

        }
    }
}