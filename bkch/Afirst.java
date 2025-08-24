import java.util.*;
class afirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter a second number:");
        float num2 = sc.nextFloat();
        System.out.println("choose the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                // Addition
                System.out.println("Performing Addition...");
                   try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                System.out.println("Result: " + (num1 + num2));
                break;
             case 2:
                // Subtraction  
                System.out.println("Performing Subtraction...");
                   try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                System.out.println("Result: " + (num1 - num2));
                break;
             case 3:
                // Multiplication
                System.out.println("Performing Multiplication...");
                   try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                // Division
                System.out.println("Performing Division...");
                   try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                if (num2 != 0 ) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            }
           
        System.out.println("Thank you for using the calculator!");
        sc.close();

        // Note: This code is a simple calculator that performs basic arithmetic operations.
    }
}