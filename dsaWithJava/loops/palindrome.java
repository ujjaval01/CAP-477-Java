import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;

        // int digit = 0;
        // int rev = 0;

        // while (num != 0) {
        //     digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num/10;
        // }

        String str = Integer.toString(originalNum);
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev)){
            System.out.println("The number " + originalNum+ " is a palindrome");
        }else{
            System.out.println("The number " + originalNum+ " is not a palindrome");
        }


    }    
}
