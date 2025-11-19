package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q287FindTheDuplicateNumber {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }

    private static List<Integer> findDuplicate(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i<arr.length){
            if(arr[i] == i+1) i++;
            else {
                int idx = arr[i] - 1;
                if(arr[i] != arr[idx]){
                    swap(i, idx, arr);
                }else{
                    i++;
                }
            }
        }
        for(i = 0; i<arr.length; i++){
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
