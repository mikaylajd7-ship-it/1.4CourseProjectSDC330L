/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/12/2026
 * Purpose: Demonstrates inheritance (Checking Account)
 *******************************************************************/
public class CheckingAccount extends Account {

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}