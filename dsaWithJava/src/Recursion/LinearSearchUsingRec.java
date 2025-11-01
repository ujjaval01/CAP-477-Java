package Recursion;

public class LinearSearchUsingRec {
    static void main() {
        int[] arr = {4, 5, 6, 4, 77, 4, 2, 96, 34};
        int ele = 77;
        System.out.println(search(arr, 0, ele));


    }

    public static boolean search(int[] arr, int idx, int tar) {
        if (idx == arr.length) return false;
        if (arr[idx] == tar) return true;
        return search(arr, idx + 1, tar);
    }
}
