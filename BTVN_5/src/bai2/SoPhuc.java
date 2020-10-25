/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoPhuc {
    private float phanThuc;
    private float phanAo;

    public SoPhuc() {
    }

    public SoPhuc(float phanThuc, float phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public float getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(float phanThuc) {
        this.phanThuc = phanThuc;
    }

    public float getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(float phanAo) {
        this.phanAo = phanAo;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần thực: ");
        this.phanThuc = sc.nextFloat();
        System.out.print("Nhập phần ảo: ");
        this.phanAo = sc.nextFloat();
    }
    
    public void Xuat(){
        System.out.println(phanThuc + " + " + phanAo + "i");
    }
    
    public SoPhuc Cong(SoPhuc x){
        SoPhuc t = new SoPhuc();
        t.phanThuc = this.phanThuc + x.phanThuc;
        t.phanAo = this.phanAo + x.phanAo;
        return t;
    }
    
    public SoPhuc Tru(SoPhuc x){
        SoPhuc t = new SoPhuc();
        t.phanThuc = this.phanThuc - x.phanThuc;
        t.phanAo = this.phanAo - x.phanAo;
        return t;
    }
    
}
