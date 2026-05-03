/*******************************************************************
 * Name: Mikayla Dickerson
 * Date: 05/03/2026
 * Purpose: Handles SQLite database operations for bank accounts.
 *******************************************************************/
import java.sql.*;
import java.util.ArrayList;

public class BankDB {

    private Connection conn;

    public BankDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:MikaylaDickerson.db");
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Accounts (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "owner TEXT," +
                "balance REAL," +
                "type TEXT)";

        try {
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // CREATE
    public void addAccount(String owner, double balance, String type) {
        String sql = "INSERT INTO Accounts(owner, balance, type) VALUES(?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, owner);
            pst.setDouble(2, balance);
            pst.setString(3, type);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // READ ALL
    public void getAllAccounts() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Owner: " + rs.getString("owner"));
                System.out.println("Balance: $" + rs.getDouble("balance"));
                System.out.println("Type: " + rs.getString("type"));
                System.out.println("----------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // UPDATE (deposit/withdraw)
    public void updateBalance(int id, double amount) {
        String sql = "UPDATE Accounts SET balance = balance + ? WHERE id = ?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDouble(1, amount);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // DELETE
    public void deleteAccount(int id) {
        try {
            PreparedStatement pst =
                conn.prepareStatement("DELETE FROM Accounts WHERE id=?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}