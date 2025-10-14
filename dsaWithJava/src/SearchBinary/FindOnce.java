package SearchBinary;
/*Given a sorted array arr[]. Find the element that appears only
 once in the array. All other elements appear exactly twice.
Examples:
Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
Output: 4
Explanation: 4 is the only element that appears exactly once.
Input: arr[] = [5]
Output: 5
Input: arr[] = [1, 2, 2, 3, 3]
Output: 1
*/

public class FindOnce {
    static void main() {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        int res = findOnce(arr);
        System.out.println(res);
    }
    static int findOnce(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-1]) return arr[n-1];
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            int fst = mid, snd = mid;
            if(arr[mid-1] ==  arr[mid]) fst = mid-1;
            else snd = mid;
            int leftCount = fst - low;
            int rightCount = high - snd;
            if(leftCount % 2 == 0) low = snd + 1;
            else high = fst -1;
        }
        return 123;
    }
}
