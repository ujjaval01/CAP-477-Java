import java.util.*;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        // using the ternery operator..
        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println(num + " is " + result);
    }

}
