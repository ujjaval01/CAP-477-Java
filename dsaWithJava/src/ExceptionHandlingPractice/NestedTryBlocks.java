package ExceptionHandlingPractice;

import java.util.Scanner;

public class NestedTryBlocks {
    static void main() {
        int[] arr = {1,2,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index number: ");
        int i = sc.nextInt();
        try {
            System.out.println("I am the outside try block...");
            try{
                System.out.println("I am the inside try block...");
                System.out.println("result: " + arr[i]);
            }catch (IndexOutOfBoundsException e){
//                System.out.println("I am the inside catch block...");
//                System.out.println("IndexOutOfBoundsException occur...");
            }
        } catch (Exception e) {
            System.out.println("I am the outside catch block");
            throw new RuntimeException(e);
        }

    }

}
