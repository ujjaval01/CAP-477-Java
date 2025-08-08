package simpleExamples;

import java.util.Scanner;

public class bankExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose one of these options: \n1. Simple Interest\n2. Compound Interest\nEnter: ");
        int type = sc.nextInt();

        System.out.print("Enter your principal amount: ");
        float amount = sc.nextFloat();

        System.out.print("Enter number of years: ");
        float year = sc.nextFloat();

        System.out.print("Enter your annual interest rate (%): ");
        float interest = sc.nextFloat();

        switch (type) {
            case 1:
                float simpleInterest = (amount * year * interest) / 100;
                float totalPaySI = amount + simpleInterest;
                System.out.println("\n--- Simple Interest ---");
                System.out.println("Interest: " + simpleInterest);
                System.out.println("Total Payable Amount: " + totalPaySI);
                break;

            case 2:
                // Compound Interest calculation yearly
                double compoundAmount = amount * Math.pow((1 + interest / 100), year);
                double compoundInterest = compoundAmount - amount;
                System.out.println("\n--- Compound Interest ---");
                System.out.println("Interest: " + compoundInterest);
                System.out.println("Total Payable Amount: " + compoundAmount);
                break;

            default:
                System.out.println("Invalid option selected.");
                break;
        }

        sc.close();
    }
}
