package LeetCodeQuestions;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 8;
        int res = maxOperations(arr, k);
        System.out.println(res);
    }
    public static int maxOperations(int[] arr, int k) {
        int count = 0;
        int l = 0;
        int h = arr.length-1;
        Arrays.sort(arr);
        while(l < h){
            if(arr[l] + arr[h] == k){
                count++;
                l++;
                h--;
            }
            else if(arr[l] + arr[h] > k) h--;
            else l++;
        }
        return count;
    }
}
