package LeetCodeQuestions;

public class Q1539FindKthPositiveUsingBS {
    static void main() {
        int[] arr = {2,3,5,6,8,9};
        int k = 3;
        int res = find(arr, k);
        System.out.println(res);
    }
    static int find(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int currValue = mid + 1;
            int missing = arr[mid] - currValue;
            if(missing >= k){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low + k;
    }
}
