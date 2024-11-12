/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
import java.util.Date;

abstract class Transaction {
    Date date;
    String type;
    float amount;
    String accountNumber;

    Transaction(String type, float amount, String accountNumber) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    abstract void printReceipt();
}
