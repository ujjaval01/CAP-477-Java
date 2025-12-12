package Stack;

import java.util.Stack;

public class RemoveConsecutiveChar {
    static void main() {
        String s = "aabbcdd";
        System.out.println(removeConsecutiveCharacter(s));
    }
    public static String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek() != ch) st.push(ch);
        }
        Stack<Character> st2 = new Stack<>();
        while(!st.isEmpty()) st2.push(st.pop());
        while(!st2.isEmpty()){
            sb.append(st2.pop());
        }
        return sb.toString();
    }
}
