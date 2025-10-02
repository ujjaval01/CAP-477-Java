package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class checkIsSortOrNot {
    static void main() {
        int[] arr = {1,5,2, 3, 5, 5, 7, 7, 7, 8, 12, 13, 15, 15, 15, 19};



        ArrayList<Integer> x = new ArrayList<>();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        ArrayList<Integer> y = new ArrayList<>(x);
        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("after sorting...");
        Collections.sort(y);
        System.out.println("x " + x);
        System.out.println("y " + y);
        if(x.equals(y)) System.out.println("true");
        else System.out.println("false");
        System.out.println(isSorted(arr));


    }
    //1,5,2, 3, 5, 5, 7, 7, 7, 8, 12, 13, 15, 15, 15, 19
    public static boolean isSorted(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] <= arr[i+1]) return true;
        }
        return false;
    }
}
