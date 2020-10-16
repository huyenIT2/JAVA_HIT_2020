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
public class QuanLy {
    private String maQl;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maQl, String hoTen) {
        this.maQl = maQl;
        this.hoTen = hoTen;
    }

    public String getMaQl() {
        return maQl;
    }

    public void setMaQl(String maQl) {
        this.maQl = maQl;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public void Input1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        this.maQl = sc.nextLine();
        System.out.print("Nhập họ tên quản lý: ");
        this.hoTen = sc.nextLine();
    }

    @Override
    public String toString() {
        return "QuanLy{" + "maQl=" + maQl + ", hoTen=" + hoTen + '}';
    }
    
    
}
