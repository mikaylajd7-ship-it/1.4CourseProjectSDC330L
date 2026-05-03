/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 05/03/2026
 * Purpose: Week 3 Project - Main application file for the
 * Bank Account Management Application.
 * Demonstrates abstraction, constructors, and access specifiers.
 *******************************************************************/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Week 4 Project - Bank Database Application");
        System.out.println("Mikayla Dickerson");
        System.out.println("This program stores bank accounts using SQLite.");
        System.out.println("You can create, view, update, and delete accounts.\n");

        BankDB db = new BankDB();
        db.createTable();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    scanner.nextLine();
                    System.out.print("Enter owner name: ");
                    String owner = scanner.nextLine();

                    System.out.print("Enter balance: ");
                    double balance = scanner.nextDouble();

                    System.out.print("Type (Checking/Savings): ");
                    scanner.nextLine();
                    String type = scanner.nextLine();

                    db.addAccount(owner, balance, type);
                    break;

                case 2:
                    db.getAllAccounts();
                    break;

                case 3:
                    System.out.print("Enter account ID: ");
                    int depId = scanner.nextInt();

                    System.out.print("Enter deposit amount: ");
                    double dep = scanner.nextDouble();

                    db.updateBalance(depId, dep);
                    break;

                case 4:
                    System.out.print("Enter account ID: ");
                    int wId = scanner.nextInt();

                    System.out.print("Enter withdrawal amount: ");
                    double w = scanner.nextDouble();

                    db.updateBalance(wId, -w);
                    break;

                case 5:
                    System.out.print("Enter account ID to delete: ");
                    int dId = scanner.nextInt();
                    db.deleteAccount(dId);
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}