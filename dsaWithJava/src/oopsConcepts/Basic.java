package oopsConcepts;

import java.util.Scanner;

public class Basic {

    public static void cal(double a, double b, int op) {
        switch (op) {
            case 1:
                System.out.println("The sum is " + (a + b));
                break;
            case 2:
                System.out.println("The subtraction is " + (a - b));
                break;
            case 3:
                System.out.println("The multiplication is " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("The division is " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public static void cal(double a, double b, double c, int op) {
        switch (op) {
            case 1:
                System.out.println("The sum is " + (a + b + c));
                break;
            case 2:
                System.out.println("The subtraction is " + (a - b - c));
                break;
            case 3:
                System.out.println("The multiplication is " + (a * b * c));
                break;
            case 4:
                if (b != 0 && c != 0)
                    System.out.println("The division is " + (a / b / c));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public static void cal(double a, double b, double c, double d, int op) {
        switch (op) {
            case 1:
                System.out.println("The sum is " + (a + b + c + d));
                break;
            case 2:
                System.out.println("The subtraction is " + (a - b - c - d));
                break;
            case 3:
                System.out.println("The multiplication is " + (a * b * c * d));
                break;
            case 4:
                if (b != 0 && c != 0 && d != 0)
                    System.out.println("The division is " + (a / b / c / d));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public static void cal(double a, double b, double c, double d, double e, int op) {
        switch (op) {
            case 1:
                System.out.println("The sum is " + (a + b + c + d + e));
                break;
            case 2:
                System.out.println("The subtraction is " + (a - b - c - d - e));
                break;
            case 3:
                System.out.println("The multiplication is " + (a * b * c * d * e));
                break;
            case 4:
                if (b != 0 && c != 0 && d != 0 && e != 0)
                    System.out.println("The division is " + (a / b / c / d / e));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OOPs concepts - Calculator using Method Overloading");
        System.out.println("Enter how many numbers you want to calculate (2 to 5): ");
        int num = sc.nextInt();

        double[] numbers = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println("Enter the operation: \nFor + enter 1\nFor - enter 2\nFor * enter 3\nFor / enter 4");
        int op = sc.nextInt();

        switch (num) {
            case 2:
                cal(numbers[0], numbers[1], op);
                break;
            case 3:
                cal(numbers[0], numbers[1], numbers[2], op);
                break;
            case 4:
                cal(numbers[0], numbers[1], numbers[2], numbers[3], op);
                break;
            case 5:
                cal(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], op);
                break;
            default:
                System.out.println("Only 2 to 5 numbers are supported.");
        }

        sc.close();
    }
}



/* 



class student{
    private int rollNo;
    private String name;
    private String subject;

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int r){
        this.rollNo = r;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String s){
        subject = s;
    }


}



public class ConstructorPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student st1 = new student();
        // st1.rollNo = 9;                  --> throw error due to private access modifier
        // st1.name = "Ujjaval";            
        // st1.subject = "ComputerScience"

        System.out.print("Enter the Roll No of the student: ");
        int stRoll = sc.nextInt();
        st1.setRollNo(stRoll);

        System.out.print("Enter the Name of the student: ");
        String stName = sc.nextLine();
        st1.setName(stName);

        System.out.print("Enter the Subject of the student: ");
        String stSubject = sc.nextLine();
        st1.setSubject(stSubject);

        System.out.println(st1.getRollNo());
        System.out.println(st1.getName());
        System.out.println(st1.getSubject());


        
    }   
}

 */