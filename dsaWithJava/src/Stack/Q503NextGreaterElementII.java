package Stack;

import java.util.Stack;

public class Q503NextGreaterElementII {
    static void main() {
        int[] arr = {4,6,1,7,5,9,8,1};
        int[] res = nextGreaterElement(arr);
        for(int r: res){
            System.out.print(r + " ");
        }
    }
    public static int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            st.push(arr[i]);
        }

        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] >= st.peek()) st.pop();
            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        return nge;
    }
}
