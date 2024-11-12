/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
class Bank {
    String bankName;
    String location;

    Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    boolean authorize(Account account) {
        return account != null;
    }

    void manageTransaction(Transaction transaction) {
        transaction.printReceipt();
    }
}
