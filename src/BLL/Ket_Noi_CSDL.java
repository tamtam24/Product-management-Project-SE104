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
    public static Connection getConnection() {
		Connection C=null;
		
		try {
		//Dky voi DriverManager
		   DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		   String url = "jdbc:mySQL://localhost:3306/se104_db";
		   String username = "root";
		   String password = "";
		   
		   
		   //Tao ket noi
		   C=DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return C;
	}
}
