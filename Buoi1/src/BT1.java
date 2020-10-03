
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
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.printf("Nhap 1 chuoi: ");
        str = sc.nextLine();
        System.out.println(str);
//        int tong = 0;
//        for (int i=0; i<str.length();i++){
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
//                tong += (int)str.charAt(i) - 48;
//            }       
//        }
//        System.out.println("Tong = " + tong);
        
        int tong = 0;
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                tong += Integer.parseInt(String.valueOf(ch));
            }       
        }
        System.out.println("Tong = " + tong);
        
    }
}
