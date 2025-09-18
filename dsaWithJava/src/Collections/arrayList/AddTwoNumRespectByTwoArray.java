package Collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumRespectByTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6}; // represents 3456
        int[] arr2 = {22, 3, 4}; // represents 1234

        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = n1 - 1;
        int j = n2 - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += arr1[i--];
            if (j >= 0) sum += arr2[j--];

            ans.add(sum % 10);   // current digit
            carry = sum / 10;    // update carry
        }

        Collections.reverse(ans);
        System.out.println(ans);
    }
}
