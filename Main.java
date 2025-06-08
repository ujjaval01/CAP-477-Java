import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      string a;
      String vowels = sc.nextLine();
      String conso = sc.nextLine();
      String charc = sc.nextLine();

      String pfw = vowels.replaceAll("[AEIOUaeiou]", "*");
      String psw = conso.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "@");
      String ptw = charc.toUpperCase();
      String result = pfw + psw + ptw;
      System.out.println(result);

    }
}