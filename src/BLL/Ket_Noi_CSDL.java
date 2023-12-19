/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Ket_Noi_CSDL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/se104_db";
        String user = "root";
        String password = "";
        try {
            // Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // If connection is successful
            System.out.println("Connected to the database successfully!");

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
