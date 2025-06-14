import java.util.Scanner;

public class RightAlignedTrangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i,space,star;
        for(i = 1; i<=num; i++){
            for(space = 1; space <= num-i; space++){
                System.out.print(" ");
            }
            for(star = 1; star<= i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
