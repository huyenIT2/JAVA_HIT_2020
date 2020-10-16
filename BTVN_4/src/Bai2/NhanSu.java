/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date ngaySinh;

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, String hoTen, Date ngaySinh) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void Input2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");
        this.maNhanSu = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = new Date();
        ngaySinh.Input();
    }

    @Override
    public String toString() {
        return "NhanSu{" + "maNhanSu=" + maNhanSu + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + '}';
    }
    
    
}
