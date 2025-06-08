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
                System.out.println("\n");
                System.out.println("Enter the number to find the factorial: ");
                int num = sc.nextInt();
                int fact = factorial(num);
                System.out.println("Factorial of " + num + " is: " + fact);
                }
    //     int a;
    //     String str = "ujjaval";
    //     Scanner sc = new Scanner(System.in);
    //     a = sc.nextInt();
    //     for(int i = 0; i<=a; i++){
    //         hello(str);
    //     }
       
    // }   
    
    // static void hello(String str){
    //     System.out.println("hello" + " str");

        // static void Factorial(int n){
        //     if(n==0){
        //         return 1;
        //         }else{
        //             return n*Factorial(n-1);
        //         }
            
        // }

    }
}

