import java.util.*;

public class StringBuilderMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
        

    }
}
