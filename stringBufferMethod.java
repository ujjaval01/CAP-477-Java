import java.util.Scanner;

public class stringBufferMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer("ujjaval ");
       //append method..
        // str.append("saini, ")
        //    .append("how ")
        //    .append("am ")
        //    .append("i");
        // System.out.println(str);

        // //insert method..
        // str.insert(1, "hii ");
        // System.out.println(str);

        String f = "abc";
        String s = "def";
        str.replace(0, 3, f);
        System.out.println(str);
        str.reverse();
        System.out.println(str);

    }
    
}
