package string;

public class ReverseEachWords {
    public static void main(String[] args) {
        String str = "my name is ujjaval";
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";
                word = "";
            }
        }

        for (int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }

        System.out.println(result);
    }
}
