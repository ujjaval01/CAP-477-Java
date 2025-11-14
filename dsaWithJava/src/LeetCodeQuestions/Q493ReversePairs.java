package LeetCodeQuestions;
/*Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].


Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1


Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1*/
public class Q493ReversePairs {
    static int count;
    static void main() {
        int[] arr = {1,3,2,3,1};
        System.out.println(reversePairs(arr));
    }


    public static int reversePairs(int[] arr) {
        count = 0;
        mergeSort(arr);
        return count;
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n <= 1) return;

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0;i<mid;i++) left[i] = arr[i];
        for(int i=0;i<n-mid;i++) right[i] = arr[mid+i];

        mergeSort(left);
        mergeSort(right);

        // 👉 correct counting before merge
        int j = 0;
        for(int i = 0; i < left.length; i++){
            while(j < right.length && (long)left[i] > 2L * right[j]){
                j++;
            }
            count += j;
        }

        merge(left, right, arr);
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
}
