package loops;

import java.util.Scanner;
class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int digit = 0;

        while (num != 0) {        // checking the digit 
            num = num / 10;
            digit++;
        }
       
        // calculating the sum of the digit ^ digit
         while (n != 0) {
            digit = n % 10;
            

         }


    }
}
