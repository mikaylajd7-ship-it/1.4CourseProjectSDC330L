public class SavingsAccount extends Account {

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}