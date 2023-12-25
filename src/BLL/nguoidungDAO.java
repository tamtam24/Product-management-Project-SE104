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
}
