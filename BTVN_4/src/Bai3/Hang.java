/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hang {
    private String maHang;
    private String tenHang;
    private int donGia;

    public Hang() {
    }

    public Hang(String maHang, String tenHang, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Hang{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + '}';
    }
    
}
