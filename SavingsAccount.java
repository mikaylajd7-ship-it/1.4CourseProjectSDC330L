/**
 * Name: Mikayla Dickerson
 * Date: 04/19/2026
 * Assignment: SDC330 Course Project – Phase 2
 * Description: Represents a savings account with interest functionality.
 * Inherits from Account and demonstrates inheritance and polymorphism.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
