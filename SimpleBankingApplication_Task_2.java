package CodeAlpha_Tasks;

import java.util.Scanner;

public class SimpleBankingApplication_Task_2 {
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Simple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    deposit(input);
                    break;
                case 2:
                    withdraw(input);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance = amount + balance;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance = amount - balance;
            System.out.println("Successfully withdraw $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. You cannot withdraw more than the current balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is $" + balance);
    }
}
