package LeetCodeQuestions;
/*Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]*/
import java.util.ArrayList;
import java.util.List;

public class Q448FindAllNumbersDisappearedInAnArray {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int  i = 0;
        while(i<n){ // 1 2 3 4 5
            // 4,3,2,7,8,2,3,1
            int correctIdx = arr[i]-1;
            if(arr[i] == i+1 || arr[i] == arr[correctIdx]) i++;
            else{
                swap(i, correctIdx, arr);
            }
        }
        for(i = 0; i<n; i++){
            if(arr[i] != i+1) ans.add(i+1);
        }
        return ans;


    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
