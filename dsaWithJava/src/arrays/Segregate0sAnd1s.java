package arrays;

import java.util.Arrays;

public class Segregate0sAnd1s {

    // two pass solution

    static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,0};
        int zeros = 0;
        int ones = 0;
//        Arrays.sort(arr);
//        for(int a: arr){
//            System.out.print(a + " ");
//        }
        for (int a : arr) {
            if (a == 0) zeros++;
            else ones++;
        }
       for (int i = 0; i < zeros; i++){
           arr[i] = 0;
       }
       for(int i = zeros; i< arr.length; i++){
           arr[i] = 1;
       }
        for (int b : arr) {
            System.out.print(b + " ");
        }

    }
}
