package string;

public class CountConsecutiveOccurrenceOfEachChar {
    public static void main(String[] args) {
        String str = "Ujjaval";
        int count = 1;
        // String curr = "";
        // String prev = "";

        for(int i = 1; i< str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            }else{
                System.out.println(str.charAt(i-1) + " -> " + count);
                count = 1;
            }
        }
        System.out.println(str.charAt(str.length() -1 ) + " -> " + count);
    }
}
