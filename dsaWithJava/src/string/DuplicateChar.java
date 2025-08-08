package string;

public class DuplicateChar {
    public static void main(String[] args) {
        String input = "ujjaval";
        input = input.toLowerCase();
        boolean visited[] = new boolean[input.length()];

        for(int i = 0; i < input.length(); i++){
            if (visited[i] || input.charAt(i) == ' ') continue;
            int count = 1;
            for(int j = i + 1; j< input.length(); j++){
                if (input.charAt(i) == input.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }if (count>1) {
                System.out.println(input.charAt(i) + "->" + count + "times");
            } 
        }
    }
}
