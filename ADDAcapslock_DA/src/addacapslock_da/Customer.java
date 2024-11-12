/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
class Customer {
    String name;
    long phoneNumber;
    String email;
    String userID;
    Account account;

    Customer(String name, long phoneNumber, String email, String userID, Account account) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userID = userID;
        this.account = account;
    }

    void updateInformation(String newEmail, long newPhoneNumber) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Customer information updated successfully.");
    }

    Object getAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
