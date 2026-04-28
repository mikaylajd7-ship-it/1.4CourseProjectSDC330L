/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 04/28/2026
 * Purpose: Week 3 Project - Main application file for the
 * Bank Account Management Application.
 * Demonstrates abstraction, constructors, and access specifiers.
 *******************************************************************/

public class App {
    public static void main(String[] args) {

        // Week 3 project title and welcome message
        System.out.println("Project Week 3 - Bank Account Management Application");
        System.out.println("Mikayla Dickerson");
        System.out.println("This program demonstrates abstraction, constructors, and access specifiers.");
        System.out.println("Welcome! The program creates accounts, processes transactions, and displays account information.\n");

        // Creating accounts using constructors
        CheckingAccount acc1 = new CheckingAccount("John Smith", 500.00);
        SavingsAccount acc2 = new SavingsAccount("Sarah Johnson", 1000.00);

        // Deposits and withdrawals
        acc1.deposit(200.00);
        acc1.withdraw(50.00);

        acc2.deposit(300.00);
        acc2.withdraw(100.00);

        // Abstract method demonstration
        acc1.monthlyUpdate();
        acc2.monthlyUpdate();

        // Display final account information
        System.out.println("Final Account Information:\n");

        acc1.displayAccountInfo();
        System.out.println();

        acc2.displayAccountInfo();
    }
}
