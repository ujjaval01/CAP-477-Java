package SearchBinary;

public class BinarySearchingInDesendingOrderArray {
    static void main() {
        int[] arr = {17,14,9,8,5,4,2,-4};
        int target = 14;
        int res = search(arr,target);
        System.out.println("Target found on index "+res);
    }

    public static int search(int[] arr, int target){
        //changes in line 12,13,14 and 15 only
        int high = 0;
        int low = arr.length-1;
        while(low>=high){
            int mid = (low + high)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid-1;
        }
        return -1;
    }

}
