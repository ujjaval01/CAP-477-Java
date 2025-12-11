package Stack;

import java.util.Stack;

public class BasicOperationsOfStack {
    static void removeAtTop(Stack<Integer> st){
        st.pop();
    }
    static Stack<Integer> AddAtAnyPosition(Stack<Integer> st, int idx, int val){
        Stack<Integer> st2 = new Stack<>();
        while(st.size() > idx){
            st2.push(st.pop());
        }
        st.push(val);
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        return st;
    }
    static Stack<Integer> removeAtAnyPosition(Stack<Integer> st, int idx){
        Stack<Integer> st2 = new Stack<>();
        while(st.size() > idx + 1){
            st2.push(st.pop());
        }
        st.pop();
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        return st;
    }


        static void display(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            int top = st.pop();
            System.out.println(top);
            st2.push(top);
        }
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
//        while(!st.empty()){
//            System.out.print(st.pop() + " ");
//        }
//        display(AddAtAnyPosition(st, 4, 70));
        display(st);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        display(removeAtAnyPosition(st, 2));
    }
}
