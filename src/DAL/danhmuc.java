/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author Admin
 */
public class danhmuc {
    private String id;
    private String ten;
    private float dongia;
    private int xoa;

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public float getDongia() {
        return dongia;
    }

    public int isXoa() {
        return xoa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setXoa(int xoa) {
        this.xoa = xoa;
    }
}
