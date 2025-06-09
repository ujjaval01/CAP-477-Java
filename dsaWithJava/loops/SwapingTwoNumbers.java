import java.util.Scanner;

public class SwapingTwoNumbers {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        // a = a + b;             // Arithmetic Method
        // b = a - b;
        // a = a - b;

        // a = a ^ b;             // XOR Method (Bitwise Swap)
        // b = a ^ b;
        // a = a ^ b;

        if(a != 0 && b != 0) {
            a = a * b;             // Arithmetic Method
            b = a / b;
            a = a / b;
            System.out.println(".......After swapping........");
            System.out.println("Number A = " + a);
            System.out.println("Number B = " + b);

        }    
    }
}
