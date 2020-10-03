
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
public class vd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.printf("Nhap 1 so nguyen: ");
        a = sc.nextInt();
        System.out.println(a);
        System.out.printf("Nhap 1 so thuc: ");
        float b = sc.nextFloat();
//        double c = sc.nextDouble();
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println(Math.PI);
        final double pi = 3.14;
        Integer x = 10; //int
        x += 5;
        Byte a1;
        System.out.println(x.compareTo(3)); //1
        System.out.println(x.equals(11));
        
        char ch = 'a';
        Character ch1 = 'b';
        
        float h = 10.6f;
        int m = (int)h;
        System.out.println("m2 = "+m);
        
        System.out.println(10/3.0);
        System.out.println((float)10/3);
        
        int[] q = new int[]{1,2,3,4,5};
        for (int i=0; i<q.length; i++){
            System.out.printf(a[i]+ " ");
        }
        
        System.out.println("\nDuyệt bằng foreach");
        for (int x : q){
            System.out.printf(x + " ");
        }
    }
}
