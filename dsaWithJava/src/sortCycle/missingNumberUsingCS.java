package sortCycle;
/*You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing.
Your task is to identify and return the missing element.
Examples:
Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.*/
public class missingNumberUsingCS {
    static void main() {
        int[] arr = {1,3,4,2,6};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]) {
        // 2,4,5,1,3
        int n = 1 + arr.length;
        int  i = 0;
        while(i<arr.length){
            if(arr[i] == i + 1 || arr[i] == n) i++;
            else{
                int idx = arr[i]-1;
                swap(i, idx, arr);
            }
        }
        for(i = 0; i<arr.length; i++){
            if(arr[i] != i+1) return i+1;
        }return n;

    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
