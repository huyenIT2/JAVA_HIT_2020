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
public class RunMain {
    public static void main(String[] args) {
        Person[] arr1 = new Person[2];
        for (int i=0; i<arr1.length; i++){
            arr1[i] = new Person();
            System.out.println("*Nhập thông tin người thứ " + (i+1) + ":");
            arr1[i].Input3();
        }
        for (int i=0; i<arr1.length; i++){
            arr1[i].HienThi();
        }


//        Scanner sc = new Scanner(System.in);
//        ArrayList<Person> list = new ArrayList<>();
//        int n;
//        n = sc.nextInt();
//        for (int i=0; i<n; i++){
//            Person x = new Person();
//            System.out.println("*Nhập thông tin người thứ " + (i+1) + ":");
//            x.Input3();
//            list.add(x);
//        }
//        for (Person nguoi : List){
//            System.out.println(nguoi);
//        }
    }
}
