package Recursion;

import java.util.Scanner;

public class PowerLinear {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Power: ");
        int b = sc.nextInt();
        System.out.println(a + " raise to the power " + b + " is: " + pow(a,b));
    }
    public static int pow(int a, int b){
        if(b == 0) return 1;
        return a*pow(a,b-1);
    }
}
