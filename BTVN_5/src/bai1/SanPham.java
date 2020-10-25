/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String tenHang;
    private String ngayNhap;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String tenHang, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHang = tenHang;
        this.ngayNhap = ngayNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SP: ");
        this.maSanPham = sc.nextLine();
        System.out.print("Nhập tên SP: ");
        this.tenSanPham = sc.nextLine();
        System.out.print("Nhập tên hãng SX: ");
        this.tenHang = sc.nextLine();
        System.out.print("Ngày nhập: ");
        this.ngayNhap = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã SP: " + maSanPham);
        System.out.println("Tên SP: " + tenSanPham);
        System.out.println("Tên hãng SX: " + tenHang);
        System.out.println("Ngày nhập: " + ngayNhap);
    }
    
}
