package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    static void main() {
        int[] arr1 = {1,1,3,4,3,5,6};
        int[] arr2 = {1,7,5,2,1,3,4};
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // 1 1 3 3 4 5 6      // 1 1 2 3 4 5 7


        int i = 0, j = 0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
               ans.add(arr1[i]);
               i++;
               j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(ans);
    }
}
