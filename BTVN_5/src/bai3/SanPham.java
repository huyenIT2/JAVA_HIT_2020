/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float donGia;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SP: ");
        this.maSP = sc.nextLine();
        System.out.print("Nhập tên SP: ");
        this.tenSP = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextFloat();
    }

    public void OutputSP() {
        System.out.println("SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", donGia=" + donGia + "}"); 
    }
      
}
