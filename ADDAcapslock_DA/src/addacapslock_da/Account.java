/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
abstract class Account {
    String accountNumber;
    String bankName;
    float balance;

    Account(String accountNumber, String bankName, float balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    abstract void cashWithdraw(float amount);
    abstract void cashDeposit(float amount);

    void miniStatement() {
        System.out.println("Mini Statement for account " + accountNumber + ":");
        System.out.println("Balance: " + balance);
    }
}
