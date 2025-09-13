package arrays;

import java.util.Arrays;

public class SimpleQuestions {
    static void main() {
        int[] arr = {7,22,1,8,3,4,5,7,2,8,9};
        Arrays.sort(arr);

//        //sum of all elements
//        int sum = 0;
//        for (int j : arr) {
//            sum += j;
//        }
//        System.out.println(sum);

//        // product of all elements
//        int product = 1;
//        for(int p: arr){
//            product*=p;
//        }
//        System.out.println(product);

//        //max element in the array
//        int max = 0;
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

//        //max element in the array
//        int min = arr[0];
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(mi n);

        for(int p: arr){
            System.out.print(p + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i] = arr[i]+10;
                System.out.print(arr[i] + " ");
            }
            else {
                arr[i]*=2;
                System.out.print(arr[i] + " ");

            }
        }







    }

}
