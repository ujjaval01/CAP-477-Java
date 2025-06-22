import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         System.out.print("Ente a String: ");

        // using for loop..........
        // String str = sc.nextLine();
        // StringBuilder rev = new StringBuilder();
        // for(int i = str.length()-1; i >= 0; i--){
        //     rev.append(str.charAt(i));
        // }

        // using reverse function.........
        StringBuilder rev = new StringBuilder(sc.nextLine());
        rev.reverse();
        System.out.println(rev);
    }
}
