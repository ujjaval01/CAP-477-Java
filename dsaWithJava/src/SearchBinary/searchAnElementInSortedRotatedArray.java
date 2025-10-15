package SearchBinary;
/*Search in Rotated Sorted Array
Difficulty: MediumAccuracy: 37.64%Submissions: 284K+Points: 4
Given a sorted and rotated array arr[] of distinct elements,
 the task is to find the index of a target key.  If the key is not present in the array, return -1.
Examples :
Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.*/
public class searchAnElementInSortedRotatedArray {
    static void main() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//      int[] arr = {9, 10, 1, 2, 3, 5, 6, 7, 8};
                      //          M
        int tar = 2;
        int res = find(arr, tar);
        System.out.println(res);
    }
    static int find(int[] arr, int tar){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == tar) return mid;
            else if (arr[low] < arr[mid]) {
                if(arr[low] <= tar && tar <= arr[mid]) high = mid -1;
                else low = mid + 1;
            }
            else if (arr[low] > arr[mid]) {
                if(arr[mid] < tar && tar < arr[high]){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }

        }
        return -1;

















//    static int find(int[] arr, int key){
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] == key) return i;
//        }
//        return -1;

    }
}
