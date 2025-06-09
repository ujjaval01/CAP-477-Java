import java.util.*;

public class Function {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the number to find the factorial: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    // ✅ Correct factorial method
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}