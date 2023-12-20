package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Provide the database connection details
            String url = "jdbc:mysql://localhost/qlbanhang";
            String user = "se104";
            String password = "password";

            // Create the connection
            connection = DriverManager.getConnection(url, user, password);

            // Perform database operations
            // ...

            System.out.println("Connected to the database!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection when done
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}