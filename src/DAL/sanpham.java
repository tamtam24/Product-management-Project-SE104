/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author Admin
 */
public class sanpham {
    private String id;
    private String danhmuc_id;
    private String ten;
    private float dongia;
    private int soluong;

    public String getId() {
        return id;
    }

    public String getDanhmuc_id() {
        return danhmuc_id;
    }


    public String getTen() {
        return ten;
    }

    public float getDongia() {
        return dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public int isXoa() {
        return xoa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDanhmuc_id(String danhmuc_id) {
        this.danhmuc_id = danhmuc_id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
