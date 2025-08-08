package string;

import java.util.Scanner;

public class Simple1 {
    public static void main(String[] args) {

        // ASCII ranges: 
        // '0'-'9' = 48–57
        // 'A'-'Z' = 65–90
        // 'a'-'z' = 97–122
        // space = 32

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Your name is "+ name);


    //     String str = "UJJAVAL";
    //     int ln = str.length();  
    //    // System.out.println(ln);
    //     String ans = "";

    //     for(int i = str.length()-1; i >= 0; i--){
    //         ans+= str.charAt(i);
    //     }
    //     System.out.println(ans);


        String str = "ujjaval";
        String str2 = "uj";
        char ch = str.charAt(3);
        int a = str2.indexOf(ch);
        System.out.println(a);
        
    }
}
        