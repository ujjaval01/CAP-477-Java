package loops;

import java.util.Scanner;

 public class fabonaciSeries {

//     static int fab(int n){
//         if(n == 1 || n == 2){
//             return n-1;
//         }
//         else{
//             return fab(n-1) + fab(n-2);
//         }
//     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // int result = fab(n);
        // System.out.println(result);
        int range = sc.nextInt();
        int first = 0; int second = 1; int next;
        System.out.print("The series is: ");
        for(int i = 0; i<=range; i++){
            System.out.print(first + ", ");
            next = first + second;
            first = second;
            second = next;
        }
     }
}
