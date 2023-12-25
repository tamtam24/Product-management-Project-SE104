/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class Ket_Noi_CSDL 
{ protected Connection con=null;
    public Ket_Noi_CSDL()
    {
       try {
		//Dky voi DriverManager
		   DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		   String url = "jdbc:mySQL://localhost:3306/qlbanhang";
		   String username = "root";
		   String password = "";
		   
		   
		   //Tao ket noi
		   con=DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}    
    }
    
}
