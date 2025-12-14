package Stack;
import java.util.*;
public class RemoveDuplicatesUsingStack {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
         Arrays.sort(arr);
         Stack<Integer> st = new Stack<>();
        for (int i : arr) {
            if (st.isEmpty() || st.peek() != i) st.push(i);
        }
         Stack<Integer> st2 = new Stack<>();
         while(!st.isEmpty()) st2.push(st.pop());

         ArrayList<Integer> res = new ArrayList<>();
         while(!st2.isEmpty()) res.add(st2.pop());

         return res;
    }
        static void main() {
            int[] arr = {1,2,1,3,3,4,5};
            System.out.println(removeDuplicates(arr));
    }
}
