/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/28/2026
 * Purpose: Abstract base class for all bank accounts.
 * Demonstrates abstraction, constructors, and access specifiers.
 *******************************************************************/

public abstract class Account {

    // Private variables protect account data
    private String owner;
    private double balance;

    // Default constructor
    public Account() {
        owner = "Unknown";
        balance = 0.0;
    }

    // Parameterized constructor
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Public getter methods
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // Protected helper method for child classes
    protected void updateBalance(double amount) {
        balance += amount;
    }

    // Public deposit method
    public void deposit(double amount) {
        updateBalance(amount);
    }

    // Public withdrawal method
    public void withdraw(double amount) {
        if (amount <= balance) {
            updateBalance(-amount);
        } else {
            System.out.println("Insufficient funds for " + owner);
        }
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }

    // Abstract method forces child classes to define monthly updates
    public abstract void monthlyUpdate();
}
