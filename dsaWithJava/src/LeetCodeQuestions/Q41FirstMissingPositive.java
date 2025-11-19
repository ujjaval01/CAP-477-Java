package LeetCodeQuestions;
/*41. First Missing Positive       (Hard)
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:  Input: nums = [1,2,0] Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:  Input: nums = [3,4,-1,1] Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:  Input: nums = [7,8,9,11,12] Output: 1
Explanation: The smallest positive integer 1 is missing.
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1*/
public class Q41FirstMissingPositive {
    static void main() {
        int[] arr = {3,9,4,3,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0, n = arr.length;
        while(i<n){
 // Agar element 1. 0 se chota ele, 2. len se bda ele, 3. correct position, 4. duplicate ho to i++....
            if(arr[i] <=0 || arr[i] > n || arr[i]==i+1 || arr[i] == arr[arr[i]-1]) i++;
            else{
                swap(i, arr[i]-1, arr);
            }
        }
        for(i = 0; i<n; i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;

        // Arrays.sort(arr);
        // int smallest = 1;

        // for (int x : arr) {
        //     if (x == smallest) {
        //         smallest++;
        //     }
        // }
        // return smallest;
    }
    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
