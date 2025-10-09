package SearchBinary;
/*Given a sorted array arr[] and an integer x, find the index (0-based) of the largest
 element in arr[] that is less than or equal to x. This element is called the floor of x.
 If such an element does not exist, return -1.
Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

Examples

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
Output: 1
Explanation: Largest number less than or equal to 5 is 2, whose index is 1.*/


public class findFloor {
    static void main() {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int res = find(arr,x);
        System.out.println(res);

    }
    static public int find(int[] arr, int x) {
            // code here
            int low = 0;
            int high = arr.length-1;
            int idx = -1;
            while(low <= high){
                int mid = (low+high)/2;
                if(arr[mid] > x) high = mid-1;
                else{
                    idx = mid;
                    low = mid+1;
                }
            }
            return idx;
        }
}
