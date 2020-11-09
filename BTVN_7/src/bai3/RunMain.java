/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<News> list = new ArrayList<>();
        
        do {
            System.out.println("--------------Menu-------------");
            System.out.println("  1. Insert news");
            System.out.println("  2. View list news");
            System.out.println("  3. Average rate");
            System.out.println("  4. Exit");
            System.out.printf("Enter your selection: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    News K = new News();
                    System.out.printf("Nhập id: ");                K.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.printf("Nhập title: ");             K.setTitle(sc.nextLine());
                    System.out.printf("Nhập publish date: ");      K.setPublishDate(sc.nextLine());
                    System.out.printf("Nhập author: ");            K.setAuthor(sc.nextLine());
                    System.out.printf("Nhập content: ");           K.setContent(sc.nextLine());
                    K.Input();
                    list.add(K);
                    break;
                case 2:
                    System.out.printf("%10s %15s %15s %15s %15s ", "id", "publishDate", "author", "content", "averageRate");
                    System.out.println();
                    for ( News x : list) {
                        x.Display();
                    }
                    break;
                case 3:
                    System.out.printf("%10s %15s %15s %15s %15s ", "id", "publishDate", "author", "content", "averageRate");
                    System.out.println();
                    for ( News x : list) {
                        x.Calculate();
                        x.Display();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, mời bạn chọn lại.");
            }    
        } while (true);
    }
}
