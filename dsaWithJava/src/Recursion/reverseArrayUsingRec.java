package Recursion;

public class reverseArrayUsingRec {
    static void main() {
        int[] arr = {2,3,4,5,6,7,8,9};
        int n = arr.length;
        rev(arr, 0, n-1);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }

    static void rev(int[] arr, int i, int j){
        if(i >=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev(arr, i+1, j-1);

    }

}
