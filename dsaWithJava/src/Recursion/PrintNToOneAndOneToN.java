package Recursion;

import java.util.Scanner;

public class PrintNToOneAndOneToN {
    static int n;
    static void main() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
    }
    static void print(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        print(n-1);
        if(n!= 1) System.out.print(n + " ");

    }
}
