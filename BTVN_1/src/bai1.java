/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class bai1 {
    public static void main(String[] args) {
        int m = 3;
        int n = 6;
        for (int i=1; i <= m; i++ )
        {
            if (i == 1 || i == m){
                for (int j=1; j<=n; j++){
                    System.out.printf("*");
                }
            }
            else{
                for (int j=1; j<=n; j++){
                    if (j == 1 || j == n){
                        System.out.printf("*");
                    }
                    else {
                        System.out.printf(" ");
                    }
                }
            } 
            System.out.println();
        } 
    }
}
