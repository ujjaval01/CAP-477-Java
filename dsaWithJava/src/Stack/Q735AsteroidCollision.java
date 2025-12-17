package Stack;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;


public class Q735AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {3,5,-6,2,1,4};
        System.out.println(asteroidCollision(arr));

    }
    public static ArrayList<Integer> asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int a : arr) {
            boolean destroyed = false;

            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (st.peek() < -a) {
                    st.pop(); // stack asteroid destroyed
                } else if (st.peek() == -a) {
                    st.pop(); // both destroyed
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // current destroyed
                    break;
                }
            }

            if (!destroyed) {
                st.push(a);
            }
        }

//        int[] res = new int[st.size()];
        ArrayList<Integer> res = new ArrayList<>();
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
        Collections.reverse(res);
        return res;
    }
}
