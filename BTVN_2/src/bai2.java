
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Nhập số phần tử mảng: ");
        n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        Max(a,n);
        Min(a,n);
        Sapxep(a,n);
        System.out.printf("Mảng sau khi được sắp xếp là: ");
        for (int i=0; i<a.length; i++){
            System.out.printf(a[i] + " ");
        }
    }
    
    public static void Max(int a[], int n){
        int max = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max = " + max);
    }
    
    public static void Min(int a[], int n){
        int min = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Min = " + min);
    }
    
    public static void Sapxep(int a[], int n){
        for (int i=0; i<a.length - 1; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i] > a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }
}
