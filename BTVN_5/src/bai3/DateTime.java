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
public class DateTime {
    private int ngay;
    private int thang;
    private int nam;

    public DateTime() {
    }

    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        this.ngay = sc.nextInt();
        System.out.print("Nhập tháng: ");
        this.thang = sc.nextInt();
        System.out.print("Nhập năm: ");
        this.nam = sc.nextInt();           
    }

    public void OutputDate() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
     
}
