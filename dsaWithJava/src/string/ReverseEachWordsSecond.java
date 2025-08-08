package string;

import java.util.Scanner;

public class ReverseEachWordsSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<= sb.length()-1; i++){
            char  ch = sb.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            }else{
                result.append(word.reverse().append(" "));
                word.setLength(0);
            }
        }
        result.append(word.reverse().toString());
        System.out.println("Each word rev sentence: " + result);


    }
}
