
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("--------------------MENU---------------------");
            System.out.println("1. Create new account.");
            System.out.println("2. Login to an existing account.");
            System.out.println("3. Sort accounts by username.");
            System.out.println("4. Exit.");
            System.out.println("---------------------------------------------");
            int chon;
            System.out.printf("Enter the choise: ");
            chon = sc.nextInt();
            
            switch (chon){
                case 1:
                    CreateNewAccount();
                    break;
                case 2:
                    Login();
                    break;
                case 3:
                    Sort();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please choose again.");
            }
        } while (true);
    }
    
    private static void CreateNewAccount(){
        Scanner sc = new Scanner(System.in);
        String regUser = "^[a-zA-Z0-9]{6,}$";
        String regPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*+-/^\\*])(?=.*[\\d])[a-zA-Z0-9!@#$%&*+-/^\\*]{8,}$";
        String regEmail = "^[A-Za-z0-9]{6,}@gmail.com$";
        String regPhone = "^0[0-9]{9}$";
        
        String text = "";
        String str;
        boolean check = true;
        Pattern pattern;
        
        System.out.print("Enter your id: ");
        do {
            str = sc.nextLine();
            check = CheckId("ACC.DAT", Integer.parseInt(str));
            if (check)
                System.out.print("Enter your id again:");
        } while (check);
        
        text += str + "|";
        
        System.out.print("Enter your full name: ");
        str = sc.nextLine();
        text += str + "|";
        
        pattern = Pattern.compile(regUser);
        System.out.print("Enter your username: ");
        do {
            str = sc.nextLine();
            check = CheckUserName("ACC.DAT", str);
            if (!pattern.matcher(str).find() || check)
                System.out.print("Enter your username again: ");           
        } while(!pattern.matcher(str).find() || check);
        text += str + "|";
        
        pattern = Pattern.compile(regPass);
        System.out.print("Enter your password: ");
        do {
            str = sc.nextLine();
            if (!pattern.matcher(str).find())
                System.out.print("Enter your password again: ");           
        } while(!pattern.matcher(str).find());
        text += str + "|";
        
        System.out.print("Enter your re password: ");
        String str1;
        do {
            str1 = sc.nextLine();
            if (str.compareTo(str1) != 0)
                System.out.print("Enter your re password again: ");
        } while (str.compareTo(str1) != 0);
        
        pattern = Pattern.compile(regEmail);
        System.out.print("Enter your email: ");
        do {
            str = sc.nextLine();
            if(!pattern.matcher(str).find())
                System.out.print("Enter your email agian: ");
        }while(!pattern.matcher(str).find());     
        text += str + "|";
 
        pattern = Pattern.compile(regPhone);
        System.out.print("Enter your phone number: ");
        do {
            str = sc.nextLine();
            if(!pattern.matcher(str).find())
                System.out.print("Enter your phone number agian: ");
        }while(!pattern.matcher(str).find());        
        text += str + "|";
        
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        str = formatter.format(date);
        text += str;
        
        WriteFile1("ACC.DAT", text);
    }
    
    private static void WriteFile1(String fileName, String str){
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(str);
            
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();  
        } catch (Exception e) {
        }
    }
    
    private static boolean CheckId(String fileName, long id){
        try {
            Scanner sc = new Scanner(Paths.get(fileName));
            while(sc.hasNext()){
                String str = sc.nextLine();
                String[] a = str.split("\\|");
                for (int i=0; i<a.length; i++){
                    if (Integer.parseInt(a[0]) == id){
                        return true;
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
        }  
        return false;
    }
    
    private static boolean CheckUserName(String fileName, String userName){
        try {
            Scanner sc = new Scanner(Paths.get(fileName));
            while(sc.hasNext()){
                String str = sc.nextLine();
                String[] a = str.split("\\|");
                for (int i=0; i<a.length; i++){
                    if (a[2].compareTo(userName) == 0){
                        return true;
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
        }  
        return false;
    }
    
    private static void Login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        boolean check = CheckAccount("ACC.DAT", userName, password);
        if (check){
            do {
                System.out.println("1. Show info.");
                System.out.println("2. Change password.");
                System.out.print("Enter your choise: ");
                int chon = sc.nextInt();
                
                switch(chon){
                    case 1:
                        Show(userName);
                        break;
                    case 2:
                        ChangePassword(userName);
                        break;
                    default:
                        System.out.println("Please choose again.");
                }
            } while(true);
        }else if(CheckUserName("ACC.DAT", userName)) {
            System.out.println("\n\tWrong password."); 
        }else {
            System.out.println("\n\tAccount is not contain."); 
        }   
    }
    
    private static boolean CheckAccount(String fileName, String userName, String password){
        try {
            Scanner sc = new Scanner(Paths.get(fileName));
            while(sc.hasNext()){
                String str = sc.nextLine();
                String[] a = str.split("\\|");
                for (int i=0; i<a.length; i++){
                    if (a[2].compareTo(userName) == 0 && a[3].compareTo(password) == 0){
                        return true;
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
        }  
        return false;
    }
    
    private static void Show(String userName){
        try {
            Scanner sc = new Scanner(Paths.get("ACC.DAT"));
            while (sc.hasNext()){
                String str = sc.nextLine();
                String[] a = str.split("\\|");
                if (a[2].compareTo(userName) == 0){
                    System.out.println("Id: " + a[0]);
                    System.out.println("Full name: " + a[1]);
                    System.out.println("User name: " + a[2]);
                    System.out.println("Email: " + a[4]);
                    System.out.println("Phone number: " + a[5]);
                    System.out.println("Create at: " + a[6]);
                    break;
                }
            }
            sc.close();
        } catch (Exception e) {
        }    
    }
    
    private static void WriteFile2(String fileName, List<String> list){
        try {
            FileWriter fileWriter = new FileWriter("ACC.DAT", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            for (String i : list){
                printWriter.println(i);
            }
            
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();  
        } catch (Exception e) {
        }
    }
    
    private static void ChangePassword(String userName){
        Scanner sc1 = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        try {
            Scanner sc2 = new Scanner(Paths.get("ACC.DAT"));
            while(sc2.hasNext()){
                String str = sc2.nextLine();
                String[] a = str.split("\\|");
                if (a[2].compareTo(userName) == 0){
                    String regPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*+-/^\\*])(?=.*[\\d])[a-zA-Z0-9!@#$%&*+-/^\\*]{8,}$";
                    Pattern pattern = Pattern.compile(regPass);
                    String str1, temp = "";
                    System.out.print("Enter your new password: ");
                    do {
                        str1 = sc1.nextLine();
                        if (!pattern.matcher(str1).find()){
                            System.out.println("Enter your new password again: ");
                        }
                    } while (!pattern.matcher(str1).find());
                    
                    String str2;
                    System.out.print("Enter your re new password: ");
                    do {
                        str2 = sc1.nextLine();
                        if (str1.compareTo(str2) != 0){
                            System.out.print("Enter your re new password again: ");
                        }
                    } while (str1.compareTo(str2) != 0);
                    
                    a[3] = str1;
                    str = "";
                    for (int i=0; i<a.length; i++){
                        str += a[i];
                        if (i<a.length - 1)
                            str += "|";
                    }
                }
                list.add(str);
            }
            sc2.close();
        } catch (Exception e) {
        } 
        
        WriteFile2("ACC.DAT", list);
    }
    
    private static void Sort(){
        try {
            Scanner sc = new Scanner(Paths.get("ACC.DAT"));
            List<String> list = new ArrayList<>();
            while(sc.hasNext()){
                list.add(sc.nextLine());
            }
            
            for (int i=0; i<list.size()-1; i++){
                for (int j=i+1; j<list.size(); j++){
                    String[] a1 = list.get(i).split("\\|");
                    String[] a2 = list.get(j).split("\\|");
                    if (a1[2].compareTo(a2[2]) > 0){
                        String tg = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, tg);
                    }
                }
            }
            
            System.out.println("--------------list of accounts after sorting----------------");
            System.out.printf("%10s %30s %30s %30s %15s %15s", "ID", "Full name", "username", "Email", "Phone", "Create at");
            for (String i : list){
                String[] a = i.split("\\|");
                System.out.printf("%10s %30s %30s %30s %15s %15s\n", a[0], a[1], a[2], a[4], a[5], a[6]);
            }
            
            WriteFile2("ACC.DAT", list);
        } catch (Exception e) {
        }     
    }
}
