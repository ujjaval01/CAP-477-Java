package LeetCodeQuestions;
/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the
numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]*/
public class Q645SetMismatch {
    static void main() {
        int[] arr = {1,2,2,4};
        int[] res = findErrorNums(arr);
        for(int e: res){
            System.out.print(e + " ");
        }
    }
    public static int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int  i = 0, j= 0;
        while(i<n){// 3 2 2, 2 3 2
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[i] == arr[idx]) i++;
            else{
                swap(i, idx, arr);
            }
        }
        for(i = 0; i<n; i++){
            if(arr[i] != i+1){
                ans[j] = arr[i];
                ans[j+1] = i+1;
            }
        }
        return ans;

    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
