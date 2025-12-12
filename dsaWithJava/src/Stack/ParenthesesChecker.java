package Stack;

import java.util.Stack;

public class ParenthesesChecker {
    static void main() {
        String str = "((){}[])";
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String s) {
        // code here
        int n = s.length();
        if(n%2 == 1) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch  =='{' || ch == '[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else{
                    char top = st.peek();
                    if(sameStyle(top, ch)) st.pop();
                    else return false;
                }
            }
        }
        return (st.isEmpty());
    }

    static boolean sameStyle(char a, char b) {
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a == '{' && b == '}') return true;
        return false;
    }
}
