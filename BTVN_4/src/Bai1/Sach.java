/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private int giaTien;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nxb, int soTrang, int giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nxb = nxb;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhập tên NXB: ");
        this.nxb = sc.nextLine();
        System.out.print("Nhập số trang: ");
        this.soTrang = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        this.giaTien = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", nxb=" + nxb + ", soTrang=" + soTrang + ", giaTien=" + giaTien + '}';
    }
    
}
