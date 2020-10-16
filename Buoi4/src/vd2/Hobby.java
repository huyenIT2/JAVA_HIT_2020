/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hobby {
    private String soThichBanNgay;
    private String soThichBanDem;

    public Hobby() {
    }

    public Hobby(String soThichBanNgay, String soThichBanDem) {
        this.soThichBanNgay = soThichBanNgay;
        this.soThichBanDem = soThichBanDem;
    }

    public String getSoThichBanNgay() {
        return soThichBanNgay;
    }

    public void setSoThichBanNgay(String soThichBanNgay) {
        this.soThichBanNgay = soThichBanNgay;
    }

    public String getSoThichBanDem() {
        return soThichBanDem;
    }

    public void setSoThichBanDem(String soThichBanDem) {
        this.soThichBanDem = soThichBanDem;
    }
    
    public void Input2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sở thích ban ngày: ");
        this.soThichBanNgay = sc.nextLine();
        System.out.print("Nhập sở thích ban đêm: ");
        this.soThichBanDem = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Ban ngày: " + soThichBanNgay +"\n" + "Ban đêm: " + soThichBanDem;
    }
    
    
}
