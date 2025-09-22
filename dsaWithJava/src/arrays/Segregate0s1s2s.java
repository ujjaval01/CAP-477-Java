package arrays;

public class Segregate0s1s2s {

    // two pass solution

    static void main(String[] args) {
        int[] arr = {1,1,0,1,0,2,0,2,2,2};
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for (int a : arr) {
            if (a == 0) zeros++;
            else if (a == 1)  ones++;
            else twos++;
        }
        System.out.println(zeros + " " + ones + " " + twos);
        for (int i = 0; i < zeros; i++){
            arr[i] = 0;
        }
        for(int i = zeros; i< zeros+ones; i++){
            arr[i] = 1;
        }
        for(int i = zeros+ones; i< arr.length; i++){
            arr[i] = 2;
        }
        for (int b : arr) {
            System.out.print(b + " ");
        }

    }
}
//import java.util.*;
//
//public class Main {
//    public static void sort012(int[] arr) {
//        int low = 0, mid = 0, high = arr.length - 1;
//
//        while (mid <= high) {
//            switch (arr[mid]) {
//                case 0:
//                    swap(arr, low, mid);
//                    low++;
//                    mid++;
//                    break;
//                case 1:
//                    mid++;
//                    break;
//                case 2:
//                    swap(arr, mid, high);
//                    high--;
//                    break;
//            }
//        }
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {0, 1, 2, 0, 1, 2};
//        sort012(arr1);
//        System.out.println(Arrays.toString(arr1)); // [0, 0, 1, 1, 2, 2]
//
//        int[] arr2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        sort012(arr2);
//        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
//    }
//}


