/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/12/2026
 * Purpose: Demonstrates composition (Bank HAS accounts)
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

    // Demonstrates polymorphism using interface
    public void processTransaction(BankOperations acc, double amount) {
        acc.deposit(amount);  // Polymorphism (interface reference)
    }
}