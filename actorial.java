import java.util.*;

public class actorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1; 


        if (n == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
                }
                System.out.println("Factorial of "+ n + " is " + fact);
            }

        }
    }
