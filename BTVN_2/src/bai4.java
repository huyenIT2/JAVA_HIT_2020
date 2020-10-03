
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
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Nhập số phần tử của mảng: ");
        n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int [] prime = new int[100];
        int j = 0;
        for (int i=0; i<100; i++){
            if (isPrime(i)){
                prime[j] = i;
                j++;
            }
        }
        
        int S = 0;
        for (int i=0; i<n; i++){
            if (isPrime(a[i])){
                S += a[i] + prime[i] - i;
            }
            else S += a[i];
        }
        System.out.println("S = " + S);
    }
    
    public static boolean isPrime(int n){
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
