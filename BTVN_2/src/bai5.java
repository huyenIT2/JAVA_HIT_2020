
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
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.printf("Nhập 1 chuỗi bất kỳ: ");
        str = sc.nextLine();
        int tong =0, dem = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                dem++;
                tong += str.charAt(i) - 48;
            }
        }
        float TBC = (float)tong/dem;
        System.out.println("TBC của các chữ số trong chuỗi là: " + TBC);
    }
}
