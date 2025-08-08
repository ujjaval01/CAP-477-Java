package loops;

import java.util.Scanner;
class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Number is zero");
        }
        else if(num >= 1){
            int digit = 0;
            int temp = Math.abs(num);
            // while(temp != 0){
            //     temp = temp / 10;
            //     digit++;
            // }

            digit = String.valueOf(temp).length();


        System.out.println("Number of digits in the number is: " + digit);
        }
        
    }
}

