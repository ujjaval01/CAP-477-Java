package arrays;

import java.sql.Array;
import java.util.Arrays;

public class SortingArrayElements {
    public static void main(String[] args) {
        int[] arr = {50,40,90,70,10};
        for (int i = 0; i<arr.length; i++){
            for(int j = 1; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}
