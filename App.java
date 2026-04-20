/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/19/2026
 * Purpose: Main application (Week 2 Project)
 *******************************************************************/
public class App {
    public static void main(String[] args) {

        System.out.println("Mikayla Dickerson - Week 2 Bank Project");
        System.out.println("Welcome! This program demonstrates inheritance, interfaces, and polymorphism.\n");

        Bank bank = new Bank();

        // Create accounts (Inheritance)
        Account acc1 = new CheckingAccount("John Doe", 1000);
        Account acc2 = new SavingsAccount("Jane Smith", 2500);

        // Add to bank (Composition)
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Polymorphism using interface
        bank.processTransaction(acc1, 200);
        bank.processTransaction(acc2, 300);

        // Display accounts
        bank.displayAccounts();
    }
}