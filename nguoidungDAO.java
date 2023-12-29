/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import BLL.Ket_Noi_CSDL
/**
 *
 * @author Admin
 */
public class nguoidungDAO {
    public boolean isExists(String username, String password) {
        Connection connection = Ket_Noi_CSDL.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean exists = false;

        try {
            String selectQuery = "SELECT * FROM nguoidung WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            exists = resultSet.next(); // Trả về true nếu có kết quả từ truy vấn, ngược lại trả về false
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi khi thực hiện truy vấn!");
        } finally {
            // Đóng kết nối và giải phóng tài nguyên
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return exists;
    }

    public void isValid(String username, String password) {
        if (isExists(username, password)) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Đăng nhập thất bại. Vui lòng kiểm tra lại thông tin đăng nhập!");
        }
    }

    public String[][] getArray() {
        String[][] danhSach = new String[100][4]
        danhSach[0][0], danhSach[0][1], danhSach[0][2], danhSach[0][3] = "id", "tendangnhap", "matkhau", "xoa";
        Connection connection = Ket_Noi_CSDL.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean exists = false;
        int index = 1;
        try {
            String selectQuery = "SELECT * FROM nguoidung";
            preparedStatement = connection.prepareStatement(selectQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String tendangnhap = resultSet.getString("tendangnhap");
                String matkhau = resultSet.getString("matkhau");
                String xoa = resultSet.getString("xoa");
                String danhSach[ index][0],String danhSach[ index][1],String danhSach[ index][2],String danhSach[ index][
                3]=id, tendangnhap, matkhau, xoa;
                index++;
            }
            exists = resultSet.next(); // Trả về true nếu có kết quả từ truy vấn, ngược lại trả về false
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi khi thực hiện truy vấn!");
        } finally {
            // Đóng kết nối và giải phóng tài nguyên
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return danhSach;
    }
}
