package SearchBinary;

public class BinarySearching {
    static void main() {
        int[] arr = {-4,2,4,5,8,9,14,17};
        int target = 14;
        int res = search(arr,target);
        System.out.println("Target found on index "+res);
    }

    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid-1;
        }
        return -1;
    }

}
