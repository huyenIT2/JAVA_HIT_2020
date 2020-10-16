/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private Date ngaySinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, Date ngaySinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
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
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã SV: ");
        this.maSinhVien = sc.nextLine();
        System.out.printf("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập thông tin ngày sinh: ");
        ngaySinh = new Date();
        ngaySinh.Input();
    }
    
    public void HienThi(){
        System.out.println("Mã SV: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
    } 
    
}
