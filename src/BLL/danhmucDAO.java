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
}