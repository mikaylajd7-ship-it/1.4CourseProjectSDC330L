/*******************************************************************
 * Demonstrates composition (Bank HAS accounts)
 *******************************************************************/
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void displayAccounts() {
        for (Account acc : accounts) {
            System.out.println("\n" + acc);
        }
    }
}