/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.danhmuc;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class danhmucDAO extends Ket_Noi_CSDL {
    
    public ArrayList<danhmuc> docdanhmuc() {
        ArrayList<danhmuc> list = new ArrayList<danhmuc>();
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
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<danhmuc> themdanhmuc(String id, String ten) {
        try {
            string sql = "insert into danhmuc values (?, ?, 0)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, ten);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<danhmuc> suadanhmuc(String oldID, String newID, String ten) {
        try {
            string sql = "update danhmuc set id = ?, ten = ? where id = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, newID);
            preparedStatement.setString(2, ten);
            preparedStatement.setString(3, oldID);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<danhmuc> xoadanhmuc(String id) {
        try {
            string sql = "update danhmuc set xoa = 1 where id = ?";
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