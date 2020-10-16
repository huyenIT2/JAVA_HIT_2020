/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd1;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        SinhVien[] arrSV = new SinhVien[2];
        for (int i=0; i<arrSV.length; i++){
            arrSV[i] = new SinhVien();
            System.out.println("Nhập thông tin SV thứ " + (i+1) + ":");
            arrSV[i].Input();
        }
        for (int i=0; i<arrSV.length; i++){
            arrSV[i].HienThi();
        }
    }
}
