/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DieuHoa extends SanPham {
    private float congSuat;
    private float giaBan;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập công suất: ");
        this.congSuat = sc.nextFloat();
        System.out.print("Nhập giá bán: ");
        this.giaBan = sc.nextFloat();
    }
    
    public void Xuat(){
        super.Xuat();
        System.out.println("Công suất: " + congSuat);
        System.out.println("Giá bán: " + giaBan);
    }
    
    public DieuHoa() {
    }

    public DieuHoa(float congSuat, float giaBan) {
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
