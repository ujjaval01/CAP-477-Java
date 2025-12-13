package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    static void main() {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(nextLargerElement(arr));
    }
    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        // initialize with -1
        for (int i = 0; i < n; i++) {
            ans.add(-1);
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans.set(st.pop(), arr[i]);
            }
            st.push(i);
        }

        return ans;
    }
}
