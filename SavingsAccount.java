/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/28/2026
 * Purpose: Represents a savings account.
 * Inherits from Account and overrides abstract methods.
 *******************************************************************/

public class SavingsAccount extends Account {

    // Default constructor
    public SavingsAccount() {
        super();
    }

    // Parameterized constructor
    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    // Monthly interest added
    @Override
    public void monthlyUpdate() {
        updateBalance(25.00);
    }

    // Display savings account info
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account");
        super.displayAccountInfo();
    }
}