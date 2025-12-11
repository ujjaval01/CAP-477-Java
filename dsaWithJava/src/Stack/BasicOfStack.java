package Stack;

import java.util.Stack;

public class BasicOfStack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(13);
        st.push(40);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
