package Stack;

import java.util.Stack;

public class Q1047RemoveAllAdjacentDuplicatesInString {
    static void main() {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch) st.pop();
            else st.push(ch);
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
