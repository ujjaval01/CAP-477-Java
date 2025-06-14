
import java.util.Scanner;

public class fabonaciSeries {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
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
