/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.sanpham;
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
    
    public ArrayList<sanpham> docsanpham() {
        ArrayList<sanpham> list = new ArrayList<>();
        try {
            String sql = "select * from sanpham";
            Statement statement = con.createStatement();
            ResultSet result =statement.executeQuery(sql);
            while(result.next()) {
                sanpham sp = new sanpham();
                sp.setId(result.getString(1));
                sp.setDanhmuc_id(result.getString(2));
                sp.setTen(result.getString(3));
                sp.setDongia(result.getFloat(4));
                sp.setSoluong(result.getInt(5));
                list.add(sp);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<sanpham> docdanhsachsptheodm(String danhmuc_id) {
        ArrayList<sanpham> list = new ArrayList<sanpham>();
        try {
            String sql = "select * from sanpham where danhmuc_id = ? ";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, danhmuc_id);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()) {
                sanpham sp = new sanpham();
                sp.setId(result.getString(1));
                sp.setDanhmuc_id(result.getString(2));
                sp.setTen(result.getString(3));
                sp.setDongia(result.getFloat(4));
                sp.setSoluong(result.getInt(5));
                list.add(sp);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int themsanpham(sanpham sp) {
        try {
            String sql = "insert into sanpham values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sp.getId());
            preparedStatement.setString(2, sp.getDanhmuc_id());
            preparedStatement.setString(3,sp.getTen());
            preparedStatement.setFloat(4, sp.getDongia());
            preparedStatement.setInt(5, sp.getSoluong());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int suasanpham(sanpham sp) {
        try {
            String sql = "update sanpham set danhmuc_id = ?, ten = ?, dongia = ?, soluong = ? where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sp.getDanhmuc_id());
            preparedStatement.setString(2, sp.getTen());
            preparedStatement.setFloat(3, sp.getDongia());
            preparedStatement.setInt(4, sp.getSoluong());
            preparedStatement.setString(5, sp.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public boolean xoasanpham(String id) {
        try {
            String sql = "delete from sanpham where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
