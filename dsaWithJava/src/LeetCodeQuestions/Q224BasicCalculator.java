package LeetCodeQuestions;
import java.util.Stack;
/*
* Given a string s representing a valid expression, implement a basic calculator to evaluate it,
and return the result of the evaluation.
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
Example 1:
Input: s = "1 + 1"
Output: 2
Example 2:
Input: s = " 2-1 + 2 "
Output: 3
Example 3:
Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
* */
public class Q224BasicCalculator {
    static void main() {
        String s = "1 + 1";
        int res = calculate(s);
        System.out.println(res);
    }
    public static int calculate(String s) {
        int result = 0;
        int sign = 1;
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the number
                num = ch - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(++i) - '0');
                }
                result += sign * num;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                // Push current result and sign to stack
                stack.push(result);
                stack.push(sign);
                // Reset for inner expression
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                // End of inner expression, combine with last values
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + (prevSign * result);
            }
            // Ignore spaces
        }

        return result;
    }
}
