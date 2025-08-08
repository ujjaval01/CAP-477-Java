package loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digit = 0;
        int rev = 0;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num /10;
        }
        System.out.println("The reverse Digit is: "+ rev);
    }    
}
