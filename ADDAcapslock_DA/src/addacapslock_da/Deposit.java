/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
class Deposit extends Transaction {
    Deposit(float amount, String accountNumber) {
        super("Deposit", amount, accountNumber);
    }

    @Override
    void printReceipt() {
        System.out.println("Deposit Receipt");
        System.out.println("Date: " + date);
        System.out.println("Account: " + accountNumber);
        System.out.println("Amount: " + amount);
    }
}