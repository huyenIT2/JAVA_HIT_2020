/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        
        int chon;
        do {
            System.out.println("-------------MENU-------------");
            System.out.println("Bam 1. Add student.");
            System.out.println("Bam 2. Edit student by id.");
            System.out.println("Bam 3. Delete student by id.");
            System.out.println("Bam 4. Sort students by gpa.");
            System.out.println("Bam 5. Sort students by name.");
            System.out.println("Bam 6. Show students.");
            System.out.println("Bam 0. Exit.");
            System.out.print("Mời bạn chọn: ");
            
            chon = sc.nextInt();
            
            switch (chon){
                case 1:
            }
        } while(true);
    }
}
