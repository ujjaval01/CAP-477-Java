import java.util.Scanner;

// square of the number( a^b )

public class SquareOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
         System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i= 1; i <= b; i++){
            ans = ans * a;
        }
        System.out.println("The square of the number " + a + " is: " + ans);

    }
}
