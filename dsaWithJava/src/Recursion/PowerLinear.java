package Recursion;

import java.util.Scanner;

public class PowerLinear {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Power: ");
        int power = sc.nextInt();
        System.out.println(base + " raise to the power " + power + " is: " + pow(base,power));
    }
    public static int pow(int base, int power){
        if(power == 0) return 1;
        return base*pow(base,power-1);
    }
}
