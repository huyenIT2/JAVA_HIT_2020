/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Phieu K = new Phieu();
        K.InputPhieu();
        System.out.println("-----------------------PHIẾU HÀNG--------------------------");
        K.OutputPhieu();
        
        float T = 0;
        for (int i=0; i<K.getN(); i++){
            T += K.getList().get(i).getDonGia() * K.getList().get(i).getSoLuong();
        }
        System.out.println("Thành tiền: " + T);
    }
}
