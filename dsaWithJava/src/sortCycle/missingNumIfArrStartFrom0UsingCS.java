package sortCycle;
/*268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.*/
public class missingNumIfArrStartFrom0UsingCS {
    static void main() {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        // Using Cycle Sort tc- O(n)
        int n = arr.length;
        int  i = 0;
        while(i<arr.length){
            if(arr[i] == i || arr[i] == n) i++;
            else{
                int idx = arr[i];
                swap(i, idx, arr);
            }
        }
        for(i = 0; i<arr.length; i++){
            if(arr[i] != i) return i;
        }return n;

    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

// Mathematical Approach....
    //     int n = arr.length;
    //     int actualSum = n * (n + 1)/2;
    //     int sum = 0;
    //     for(int e: arr){
    //         sum = sum+e;
    //     }
    //     return actualSum - sum;
    // }
}
