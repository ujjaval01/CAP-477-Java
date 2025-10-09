package SearchBinary;
/*
Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.
Examples:
Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6
*/
import java.util.ArrayList;

public class firstAndLastOccurrences {
    static void main() {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int k = 5;
        ArrayList<Integer> integers = find(arr, k);
        System.out.println(integers);

    }


    // User function Template for Java
    static ArrayList<Integer> find(int[] arr, int k) {
        // code here
        int n = arr.length;

        //first occurrence.....
        int low = 0;
        int high = n-1;
        int idx1 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                idx1 = mid;
                high = mid-1;
            }
            else if(arr[mid] > k) high = mid-1;
            else low = mid + 1;
        }

        //last occurrrence
        low = 0;
        high = n-1;
        int idx2 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                idx2 = mid;
                low = mid+1;
            }
            else if(arr[mid] > k) high = mid-1;
            else low = mid + 1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(idx1);
        res.add(idx2);
        return res;

    }


}
