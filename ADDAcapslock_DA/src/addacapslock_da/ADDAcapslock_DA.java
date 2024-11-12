/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */

import java.util.InputMismatchException;

import java.util.Scanner;
        
public class ADDAcapslock_DA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize Bank, ATM, Accounts, and Customers
        Bank bank = new Bank("ADDA_CAPSLOCK_BANK", "Main Branch");
        ATM atm = new ATM("ADDA_CAPSLOCK_BANK", "Main Branch", 1234); // Set a PIN (e.g., 1234)
        Account account = new Checkings("ACC123456", "ADDA_CAPSLOCK_BANK", 1000);
        Customer customer = new Customer("Mukesh Kannan", 1234567890L, "mukesh@gmail.com", "1234", account);
        
        System.out.println("Welcome to " + atm.bankName + " ATM");

        // Language Selection
        atm.selectLanguage("English");

        // Prompt for PIN and validate
        int enteredPIN = -1;
        while (enteredPIN == -1) {
            System.out.print("Enter your PIN: ");
            try {
                enteredPIN = scanner.nextInt();  // Enter PIN as an integer
                if (!atm.validatePin(enteredPIN)) {
                    System.out.println("Invalid PIN.");
                    enteredPIN = -1;  // Reset the PIN if invalid
                } else {
                    System.out.println("Welcome, " + customer.name + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer PIN.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        // Authorization Check
        if (!bank.authorize(customer.account)) {
            System.out.println("ATM authorization failed. Please try again later.");
            return;
        }

        int choice;
        while (true) {
            atm.displayOptions();
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Please enter a valid number.");
                scanner.nextLine();  // Consume the invalid input
                continue;  // Skip to the next iteration of the loop
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmount = -1;
                    while (withdrawAmount == -1) {
                        try {
                            withdrawAmount = scanner.nextFloat();
                            customer.account.cashWithdraw(withdrawAmount);
                            bank.manageTransaction(new Withdraw(withdrawAmount, customer.account.accountNumber));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.nextLine();  // Consume the invalid input
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    float depositAmount = -1;
                    while (depositAmount == -1) {
                        try {
                            depositAmount = scanner.nextFloat();
                            customer.account.cashDeposit(depositAmount);
                            bank.manageTransaction(new Deposit(depositAmount, customer.account.accountNumber));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.nextLine();  // Consume the invalid input
                        }
                    }
                    break;

                case 3:
                    customer.account.miniStatement();
                    break;

                case 4:
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.next();
                    System.out.print("Enter new phone number: ");
                    long newPhoneNumber = scanner.nextLong();
                    customer.updateInformation(newEmail, newPhoneNumber);
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
        }
    }
}



