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
public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public void Input2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã máy: ");
        this.maMay = sc.nextLine();
        System.out.print("Nhập kiểu máy: ");
        this.kieuMay = sc.nextLine();
        System.out.print("Nhập tình trạng: ");
        this.tinhTrang = sc.nextLine();
    }

    @Override
    public String toString() {
        return "May{" + "maMay=" + maMay + ", kieuMay=" + kieuMay + ", tinhTrang=" + tinhTrang + '}';
    }
    
    
}
