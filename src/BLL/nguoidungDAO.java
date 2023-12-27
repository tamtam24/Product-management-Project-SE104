/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.nguoidung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class nguoidungDAO extends Ket_Noi_CSDL{
    public nguoidung dangnhap(String username,String password){
        nguoidung user=null;
        try{
            //chuan bi 2 tham so tennd,matkhau de nguoi dung nhap vao
            String SQL="select * from nguoidung where tendangnhap=? and matkhau=?";
            PreparedStatement pre = con.prepareStatement(SQL);
            //chuyen username,password sang string
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs= pre.executeQuery();
            if(rs.next())
            {
                user= new nguoidung();
                user.setId(rs.getString(1));
                user.setTendangnhap(rs.getString(2));
                user.setMatkhau(rs.getString(3));
              
                
             }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return user;
    
    }

    public ArrayList<danhmuc> themnguoidung(String id, String username, String password) {
        try {
            string sql = "insert into nguoidung values (?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<danhmuc> suanguoidung(String oldID, String newID, String username, String password) {
        try {
            string sql = "update nguoidung set id = ?, tendangnhap = ?, matkhau = ? where id = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, newID);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, oldID);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<danhmuc> xoanguoidung(String id) {
        try {
            string sql = "delete from nguoidung where id = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
