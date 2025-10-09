package SearchBinary;
/*852. Peak Index in a Mountain Array

You are given an integer mountain array arr of length n where the
 values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
Example 1:
Input: arr = [0,1,0]
Output: 1
Example 2:
Input: arr = [0,2,1,0]
Output: 1
*/

public class peakIndexInMountainArray {
    static void main() {
        int[] arr = {1,2,3,8,4,3,2,1};
        int res = search(arr);
        System.out.println(res);
    }
        static int search(int[] arr) {
            int low = 1;
            int high = arr.length-2;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
                else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid+1]) low = mid + 1;
                else high = mid -1;
            }
            return 99;
        }
}
