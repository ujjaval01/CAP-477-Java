package string;

public class CountNumOfWords {
    public static void main(String[] args) {
        String str = "  u  j ";
        int ln = str.length();
        String[] word = str.trim().split("\\s+");
        // int ln2 = word.length();
         int count = word.length;
        System.out.println(str+ ln);
        // System.out.println(word + ln2);



         System.out.println("The total number in words \"" + word + "\" is: " + count);
    }
}
