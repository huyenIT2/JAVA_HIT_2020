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
public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;

    public Phieu() {
    }

    public Phieu(String maPhieu, Hang[] x, int n) {
        this.maPhieu = maPhieu;
        this.x = x;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void Input2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        this.maPhieu = sc.nextLine();
        System.out.print("Nhập số mặt hàng: ");
        this.n = sc.nextInt();
        x = new Hang[n];
        
        for (int i=0; i<x.length; i++){
            x[i] = new Hang();
            System.out.println("*Nhập thông tin hàng thứ " + (i+1) + ":");
            x[i].Input();
        }
    }

    public void Show(){
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Thông tin mặt hàng: ");
        for (int i=0; i<x.length; i++){
            System.out.println(x[i].toString());
        }
    }
    
    
}
