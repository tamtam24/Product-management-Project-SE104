/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.sanpham;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class sanphamDAO extends Ket_Noi_CSDL  {
     public ArrayList<sanpham> docdanhsachsptheodm(String madm) {
        ArrayList<sanpham> list = new ArrayList<>();
        try {
            String sql="select * from sanpham where madm=?";
            PreparedStatement statement= con.prepareStatement(sql);
            ResultSet result =statement.executeQuery(sql);
            while(result.next()) {
                sanpham sp = new sanpham();
                sp.setId(result.getString(1));
                sp.setTen(result.getString(2));
                sp.setDongia(result.getFloat(3));
                sp.setSoluong(result.getInt(4));
                list.add(sp);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
