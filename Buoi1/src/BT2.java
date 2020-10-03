
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
public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Nhap so nguyen duong n: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int tong =0;
        for (int i=0; i<a.length; i++){
            if (SNT(a[i])){
                tong += a[i];
            }
        }
        System.out.println("tong = " + tong);
    }
    public static boolean SNT(int n){
        if (n < 2){
            return false;
        }
        for (int i=2; i <= Math.sqrt(n); i++){
           if (n % i == 0){
               return false;
           }
        }
        return true;
    }
}
