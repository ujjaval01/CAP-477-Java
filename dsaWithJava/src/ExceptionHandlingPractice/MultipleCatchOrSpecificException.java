package ExceptionHandlingPractice;

import java.util.Scanner;

public class MultipleCatchOrSpecificException {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        System.out.println("Enter the index number: ");
        int i = sc.nextInt();
        System.out.println("Enter the division: " );
        int d = sc.nextInt();
        try{
            System.out.println("The index value is: " + arr[i]);
            System.out.println("After division the result is: " + arr[i]/d);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs...\n" + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException occurs...\n" + e);
        }
        catch (Exception e){
            System.out.println(e + " occurs...");
        }
    }
}
