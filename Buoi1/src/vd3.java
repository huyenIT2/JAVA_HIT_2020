
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
public class vd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "10.6";
        float a = Float.parseFloat(x);
        double number = Double.parseDouble(x);
        System.out.println("number = " + number);
        
        int xx = 10;
        String str = String.valueOf(xx);
        System.out.println("str = "+str);
        Show();
        System.out.println("3 + 5 = " + Sum(3,5));
    }
    
    public static void Show(){
        System.out.println("Ban vua goi ham show()");
    }
    
    public static int Sum(int a, int b){
        return a + b;
    }
}
