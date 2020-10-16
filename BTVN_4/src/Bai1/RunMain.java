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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số sách: ");
        n = sc.nextInt();
        Sach[] x = new Sach[n];
        for (int i=0; i<x.length; i++){
            x[i] = new Sach();
            System.out.println("*Nhập thông tin sách thứ " + (i+1) + ":");
            x[i].Input();
        }
        System.out.println("Thông tin các sách: ");
        for (int i=0; i<x.length; i++){
            System.out.println(x[i].toString());
        }
    }
}
