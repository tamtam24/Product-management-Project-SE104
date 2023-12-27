/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author Admin
 */
public class sanphamDAO {
    public ArrayList<danhmuc> docsanpham() {
        ArrayList<danhmuc> list = new ArrayList<danhmuc>();
        try {
            String sql = "select * from sanpham";
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

    public ArrayList<danhmuc> themsanpham(String id, String danhmuc_id, String ten, float dongia, int soluong) {
        try {
            string sql = "insert into nguoidung values (?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
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

    public ArrayList<danhmuc> suasanpham(String oldID, String newID, String danhmuc_id, String ten, float dongia, int soluong) {
        try {
            string sql = "update nguoidung set id = ?, danhmuc_id = ?, ten = ?, dongia = ?, soluong = ? where id = ?";
            preparedStatement = con.prepareStatement(sql);
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

    public ArrayList<danhmuc> xoasanpham(String id) {
        try {
            string sql = "delete from sanpham where id = ?";
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
