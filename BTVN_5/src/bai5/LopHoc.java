/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private ArrayList<SinhVien> list;
    private int n;
    private String giaoVien;

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, ArrayList<SinhVien> list, int n, String giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.list = list;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp: ");
        maLH = sc.nextLine();
        System.out.print("Nhập tên lớp: ");
        tenLH = sc.nextLine();
        System.out.print("Nhập ngày mở: ");
        ngayMo = sc.nextLine();
        System.out.print("Nhập giáo viên: ");
        giaoVien = sc.nextLine();
        System.out.print("Nhập số SV: ");
        n = sc.nextInt();
        list = new ArrayList<>();
        for (int i=0; i<n; i++){
            SinhVien sv = new SinhVien();
            System.out.println("*Nhập SV thứ " + (i+1) + ":");
            sv.Nhap();
            list.add(sv);
        }
    }
    
    public void Xuat(){
        System.out.println("-------------------------THÔNG TIN LỚP HỌC-----------------------------");
        System.out.println("Mã lớp học: " + maLH);
        System.out.println("Tên lớp học: " + tenLH);
        System.out.println("Ngày mở: " + ngayMo);
        System.out.println("Giáo viên: " + giaoVien);
        System.out.println("Thông tin các SV: ");
        for (int i=0; i<n; i++){
            list.get(i).Xuat();
        }
   }
}
