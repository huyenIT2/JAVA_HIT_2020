/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, float dienTich, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        this.tenPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        this.tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        this.dienTich = sc.nextFloat();
        x = new QuanLy();
        x.Input1();
        System.out.print("Nhập số máy: ");
        this.n = sc.nextInt();
        y = new May[n];
        for (int i=0; i<y.length; i++){
            y[i] = new May();
            System.out.println("Nhập mặt hàng thứ " + (i+1) + ":");
            y[i].Input2();
        }
    }
    
    public void Show(){
        System.out.println("\t\t\tTHÔNG TIN PHÒNG MÁY");
        System.out.println("Mã phòng: " + this.maPhong);
        System.out.println("Tên phòng: " + this.tenPhong);
        System.out.println("Diện tích: " + this.dienTich);
        System.out.println("Thông tin người quản lý: " + x.toString());
        System.out.println("Thông tin các máy là: ");
        for (int i=0; i<y.length; i++){
            System.out.println(y[i].toString());
        }
    }
}
