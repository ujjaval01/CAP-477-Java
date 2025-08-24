package Java;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        System.out.println("__________________________________________________________________________");
        System.out.print("\n");

        System.out.println("This is a fully feature loaded Calculator, use carefully..!");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your first value: ");
            float a = sc.nextFloat();
            System.out.print("Enter your second value: ");
            float b = sc.nextFloat();
            System.out.println(
                    "Select Operation..\nFor + operation Enter 1\nFor - operation Enter 2\nFor * operation Enter 3\nFor / operation Enter 4\nFor % operation Enter 5");
            System.out.print("Enter key: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Result is: " + a + b);
                    // System.out.println(a + b);
                    break;
                case 2:
                    // System.out.print("Result is: " + a - b); [ in java minus operator is not
                    // allow for these type of operation. ]

                    System.out.print("Result is: ");
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.print("Result is: " + a * b);
                    // System.out.println(a * b);
                    break;
                case 4:
                    System.out.print("Result is: " + a / b);
                    // System.out.println(a / b);
                    break;
                case 5:
                    System.out.print("Result is: " + a % b);
                    // System.out.println(a % b);
                    break;

                default:
                    System.out.println("You entered wrong operation key, please check the key..!");
                    break;
            }
        }

    }
}