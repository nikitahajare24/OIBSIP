package tasks;

import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PIN number for authentication
        int pin = 1234;

        // Current account balancer
        double balance = 1000.0;

        // ATM interface
        System.out.println("Welcome to the ATM!");
        
        // Authenticate the user
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != pin) {
            System.out.println("Invalid PIN. Exiting...");
            System.exit(0);
        }

        // Display menu options
        System.out.println("\nMain Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        // Handle user's choice
        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is: $" + balance);
                break;

            case 2:
                System.out.print("Enter the amount to withdraw: $");
                double withdrawAmount = scanner.nextDouble();

                if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful!");
                    System.out.println("Remaining balance: $" + balance);
                }
                
                break;

            case 3:
                System.out.print("Enter the amount to deposit: $");
                double depositAmount = scanner.nextDouble();

                balance += depositAmount;
                System.out.println("Deposit successful!");
                System.out.println("Updated balance: $" + balance);

                break;

            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

