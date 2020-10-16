/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private Date ngaySinh;
    private String gender;
    private Hobby hobby;

    public Person() {
    }

    public Person(String name, Date ngaySinh, String gender, Hobby hobby) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }
    
    public void Input3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = new Date();
        ngaySinh.Input();
        System.out.print("Nhập giới tính: ");
        this.gender = sc.nextLine();
        System.out.println("Nhập sở thích: ");
        hobby = new Hobby();
        hobby.Input2(); 
    }
    
    public void HienThi(){
        System.out.println("Tên: " + name);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gender);
        System.out.println("Sở thích: " + hobby);
    }
}
