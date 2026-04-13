/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/12/2026
 * Purpose: Main application (Week 1 Project)
 *******************************************************************/
public class App {
    public static void main(String[] args) {

        System.out.println("Mikayla Dickerson - Week 1 Bank Project");
        System.out.println("Welcome to the Bank Account Management System\n");

        Bank bank = new Bank();

        // Create accounts (Inheritance)
        Account acc1 = new CheckingAccount("John Doe", 1000);
        Account acc2 = new SavingsAccount("Jane Smith", 2500);

        // Add to bank (Composition)
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Display accounts
        bank.displayAccounts();
    }
}