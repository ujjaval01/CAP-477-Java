package Stack;

import java.util.Stack;

public class Q682BaseballGame {
    static void main() {
        String[] arr = {"5","2","C","D","+"};
        System.out.println(calPoints(arr));
    }
    public static int calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (String s : arr) {
            switch (s) {
                case "C" -> st.pop();
                case "D" -> st.push(2 * st.peek());
                case "+" -> {
                    int top = st.pop();
                    int secondTop = st.peek();
                    int sum = top + secondTop;
                    st.push(top);
                    st.push(sum);
                }
                default -> st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum = sum + st.pop();
        }
        return sum;
    }
}
