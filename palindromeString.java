import java.util.Scanner;

public class palindromeString {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    String pString = new StringBuilder(str).reverse().toString();

    // System.out.println("original: "+ str);

    if(str.equals(pString)){
        System.out.println("yes, Given string is a palindrome String");
    
    }else{
        System.out.println("no, Given string is not a palindrome String");
    }
 }   
}
