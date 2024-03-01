package patternPrinting;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row value: ");
        int r = sc.nextInt();
        System.out.print("Enter a column value: ");
        int c = sc.nextInt();

        for (int j = 1; j <= r; j++) {

            for (int i = 1; i <= c; i++) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }

}
