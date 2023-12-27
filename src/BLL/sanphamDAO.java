/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.danhmuc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class sanphamDAO extends Ket_Noi_CSDL {
    public ArrayList<danhmuc> docsanpham() {
        ArrayList<danhmuc> list = new ArrayList<danhmuc>();
        try {
            String sql = "select * from sanpham";
            Statement statement = con.createStatement();
            ResultSet result =statement.executeQuery(sql);
            while(result.next()) {
                danhmuc dm = new danhmuc();
                dm.setId(result.getString(1));
                dm.setTen(result.getString(2));
                dm.setXoa(result.getInt(3));
                list.add(dm);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int themsanpham(String id, String danhmuc_id, String ten, float dongia, int soluong) {
        try {
            String sql = "insert into nguoidung values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, danhmuc_id);
            preparedStatement.setString(3, ten);
            preparedStatement.setFloat(4, dongia);
            preparedStatement.setInt(5, soluong);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int suasanpham(String oldID, String newID, String danhmuc_id, String ten, float dongia, int soluong) {
        try {
            String sql = "update nguoidung set id = ?, danhmuc_id = ?, ten = ?, dongia = ?, soluong = ? where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, newID);
            preparedStatement.setString(2, danhmuc_id);
            preparedStatement.setString(3, ten);
            preparedStatement.setFloat(4, dongia);
            preparedStatement.setInt(5, soluong);
            preparedStatement.setString(6, oldID);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int xoasanpham(String id) {
        try {
            String sql = "delete from sanpham where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
