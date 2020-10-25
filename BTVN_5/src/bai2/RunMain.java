/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        SoPhuc A = new SoPhuc();
        A.Nhap();
        SoPhuc B = new SoPhuc();
        B.Nhap();
        
        SoPhuc Tong = A.Cong(B);
        System.out.print("Số phức tổng là: ");
        Tong.Xuat();
        
        SoPhuc Hieu = A.Tru(B);
        System.out.print("Số phức hiệu là: ");
        Hieu.Xuat();
    }
}
