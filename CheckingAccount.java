/*******************************************************************
 * Demonstrates inheritance (child class)
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