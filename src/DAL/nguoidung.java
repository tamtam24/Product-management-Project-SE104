/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author Admin
 */
public class nguoidung {
    private String id;
    private String tendangnhap;
    private String matkhau;
    private int xoa;

    public String getId() {
        return id;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public int isXoa() {
        return xoa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setXoa(int xoa) {
        this.xoa = xoa;
    }
}
