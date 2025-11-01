package Recursion;

public class BinarySearchUsingRecursion {
    static void main() {
        int[] arr = {2,3,5,6,7,9,13,17,21,33,55};
        int tar = 21;
        int res = search(arr, tar);
        System.out.println(res);
    }
    public static int helper(int[] arr, int tar, int low, int high){
        if(low > high) return -1;
        int mid = low + (high - low)/2;
        if(arr[mid] == tar) return mid;
        else if (arr[mid] > tar) return helper(arr, tar, low, mid-1);
        else return helper(arr, tar, mid + 1, high);
    }

    public static int search(int[] arr, int tar){
        int n = arr.length;
        return helper(arr, tar, 0, n-1);
    }
}
