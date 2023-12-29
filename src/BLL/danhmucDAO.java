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
public class danhmucDAO extends Ket_Noi_CSDL {
    
    public ArrayList<danhmuc> docdanhmuc() {
        ArrayList<danhmuc> list = new ArrayList<>();
        try {
            String sql="select * from danhmuc";
            Statement statement= con.createStatement();
            ResultSet result =statement.executeQuery(sql);
            while(result.next()) {
                danhmuc dm = new danhmuc();
                dm.setId(result.getString(1));
                dm.setTen(result.getString(2));
                dm.setXoa(result.getInt(3));
                list.add(dm);
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int themdanhmuc(danhmuc dm) {
        try {
            String sql = "insert into danhmuc values (?, ?, 0)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, dm.getId());
            preparedStatement.setString(2, dm.getTen());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int suadanhmuc(String id, danhmuc dm) {
        try {
            String sql = "update danhmuc set id = ?, ten = ? where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, dm.getId());
            preparedStatement.setString(2, dm.getTen());
            preparedStatement.setString(3, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int xoadanhmuc(String id) {
        try {
            String sql = "update danhmuc set xoa = 1 where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}