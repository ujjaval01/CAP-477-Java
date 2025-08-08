package patternPrinting;

import java.util.Scanner;

public class InvertedStarTriangle {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
    
    
        for(int i = num; i > 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
    
        }
    }
}
