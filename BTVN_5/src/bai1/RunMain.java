/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        
        ArrayList<DieuHoa> list = new ArrayList<>();
        
        for (int i=0; i<n; i++){
            System.out.println("*Nhập thông tin điều hoà thứ " + (i+1) + ":");
            DieuHoa dh = new DieuHoa();
            dh.Nhap();
            list.add(dh);
        }
        
        System.out.println("THÔNG TIN CÁC ĐIỀU HOÀ");
        for (DieuHoa dh : list){
            dh.Xuat();
        }
        
        float min = list.get(0).getGiaBan();
        
        for (DieuHoa dh : list){
            if (dh.getGiaBan() < min){
                min = dh.getGiaBan();
            }
        }
        
        for (DieuHoa dh : list){
            if (dh.getGiaBan() == min && dh.getTenHang().compareToIgnoreCase("Electrolux") == 0){
                dh.Xuat();
            }
            else {
                System.out.println("Không có điều hoà có hãng SX Electrolux và giá thấp nhất.");
                break;
            }
        }
        
    }
}
