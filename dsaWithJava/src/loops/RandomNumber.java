package loops;

import java.util.Random;
import java.util.Scanner;

// otp generater


public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit user want: ");
        int digit = sc.nextInt();
        int num = 0;

        switch (digit) {
            case 4:
                digit = 9000;
                num = 1000;
                break;
            case 6:
                digit = 900000;
                num = 100000;
                break;
            default:
                break;
        }

        Random rand = new Random();
        int otp = num + rand.nextInt(digit);
        System.out.println("Otp is: " + otp);
    }
}
