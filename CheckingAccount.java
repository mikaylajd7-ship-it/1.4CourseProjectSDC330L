/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/28/2026
 * Purpose: Represents a checking account.
 * Inherits from Account and overrides abstract methods.
 *******************************************************************/

public class CheckingAccount extends Account {

    // Default constructor
    public CheckingAccount() {
        super();
    }

    // Parameterized constructor
    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    // Monthly service fee
    @Override
    public void monthlyUpdate() {
        updateBalance(-10.00);
    }

    // Display checking account info
    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account");
        super.displayAccountInfo();
    }
}