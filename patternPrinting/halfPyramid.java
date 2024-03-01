package patternPrinting;
import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a row value: ");
        // int r = sc.nextInt();
        // System.out.print("Enter a column value: ");
        // int c = sc.nextInt();

        int r = 4;
        int c = 4;

        //Right side half pyramid..
        for(int i =1; i<=r; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("---------------------------");


       //Left side half Pyramid..

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}