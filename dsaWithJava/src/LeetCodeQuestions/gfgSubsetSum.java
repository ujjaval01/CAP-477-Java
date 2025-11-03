package LeetCodeQuestions;
/*Given an array arr of integers, return the sums of all subsets in the list.  Return the sums in any order.
Examples:
Input: arr[] = [2, 3]
Output: [0, 2, 3, 5]
Explanation: When no elements are taken then Sum = 0. When only 2 is taken then Sum = 2. When only 3 is taken
then Sum = 3. When elements 2 and 3 are taken then Sum = 2+3 = 5.

Input: arr[] = [1, 2, 1]
Output: [0, 1, 1, 2, 2, 3, 3, 4]
Explanation: The possible subset sums are 0 (no elements), 1 (either of the 1's), 2 (the element 2), and their combinations.*/

import java.util.ArrayList;
public class gfgSubsetSum {
    static void main() {
        int[] arr = {2,3};
        System.out.println(subsetSums(arr));
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        helper(arr, 0, 0, list);
        // return (ArrayList<Integer>) list;  // typecasting, if we are using list instead of arrayList
        return list;
    }
    public static void helper(int[] arr, int idx, int sum, ArrayList<Integer> list){
        if(arr.length == idx){
            list.add(sum);
            return;
        }
        helper(arr, idx+1, sum+arr[idx], list);
        helper(arr, idx+1, sum, list);
    }
}
