/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addacapslock_da;

/**
 *
 * @author 91808
 */
class ATM {
    int pin;
    String location;
    String bankName;

    ATM(String bankName, String location, int par) {
        this.bankName = bankName;
        this.location = location;
        this.pin = par;
    }

    boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    void displayOptions() {
        System.out.println("\n1. Withdraw Cash");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Mini Statement");
        System.out.println("4. Update Information");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");
    }
    
     

    void selectLanguage(String language) {
        System.out.println("Language set to: " + language);
    }
}