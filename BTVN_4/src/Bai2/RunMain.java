/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        NhanSu x = new NhanSu();
        System.out.println("*Nhập thông tin: ");
        x.Input2();
        System.out.println("*Thông tin là: " + x.toString());
    }
}
