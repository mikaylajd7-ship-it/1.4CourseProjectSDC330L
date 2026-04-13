/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/12/2026
 * Purpose: Abstract base class for bank accounts (Inheritance)
 *******************************************************************/
public abstract class Account {
    protected String owner;
    protected double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract String getAccountType();

    @Override
    public String toString() {
        return "Owner: " + owner +
               "\nBalance: $" + balance +
               "\nType: " + getAccountType();
    }
}