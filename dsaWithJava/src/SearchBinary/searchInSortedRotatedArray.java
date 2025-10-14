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
public class searchInSortedRotatedArray {
    static void main() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 9;
        int res = find(arr, key);
        System.out.println(res);

    }
    static int find(int[] arr, int key){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == key) return i;
        }
        return -1;

    }
}
