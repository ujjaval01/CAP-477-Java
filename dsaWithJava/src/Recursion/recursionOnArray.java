package Recursion;

public class recursionOnArray {
    static void main() {
        int[] arr = {4,5,6,4,77,4,2,96,34};
        print(arr, 0);

    }
    static void print(int[] arr, int idx){
        if (idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        print(arr, idx+1);
    }
}
