/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String diaChi;

    public void DiHoc(){
        System.out.println("Hnay toi di hoc");
    }
    
    public SinhVien(){
        System.out.println("Đây là hàm khởi tạo");
    }

    public SinhVien(String maSinhVien, String hoTen, String diaChi) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
