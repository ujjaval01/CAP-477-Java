package Recursion;

public class checkingFirstOccurrenceOfTheElement {
    static void main() {
        int[] arr = {2,3,4,5,6,7,7,8};
        int i = 0, j = 1;
        int res = checkOccurrence(arr, i, j);
        System.out.println(res);
    }
    static int checkOccurrence(int[] arr, int i, int j){
        int n = arr.length;
        if(j == n) return -1; // not found
        if(arr[i] == arr[j]) return i;
        else return checkOccurrence(arr, i+1, j+1);
    }
}

// founded
