import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Provide the database connection
    public static Connection getConnection() {
        // Connection string with port specified
        String url = "jdbc:sqlserver://COMPUTERLAB-12:1433;databaseName=Company;integratedSecurity=false;";
        String username = "admin";  // Replace with your SQL Server username
        String password = "admin123";  // Replace with your SQL Server password
        
        try {
            // Load the JDBC driver class (only needed in some cases)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish the connection
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            return null;  // Return null if connection fails
        }
    }

    public static void main(String[] args) {
        // Test the connection
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Successfully connected to the database!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
