package loops;

import java.util.Scanner;

class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the range where u want the max multiplication: ");
        int range = sc.nextInt();
        for(int i = 1; i<=range; i++){
            int result = i*num;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}