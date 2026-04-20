/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/19/2026
 * Purpose: Demonstrates inheritance (Savings Account)
 *******************************************************************/
public class SavingsAccount extends Account {

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}