/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
class Withdraw extends Transaction {
    Withdraw(float amount, String accountNumber) {
        super("Withdrawal", amount, accountNumber);
    }

    @Override
    void printReceipt() {
        System.out.println("Withdrawal Receipt");
        System.out.println("Date: " + date);
        System.out.println("Account: " + accountNumber);
        System.out.println("Amount: " + amount);
    }
}
