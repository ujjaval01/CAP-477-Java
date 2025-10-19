package Arrays2d;
/* like example-
           4  5   6     ------->      4  5  6
           7  1   8     <-------      8  1  7
           9  7  3     ------->       9  7  3
           */


import java.util.Arrays;

public class PrintingElementInSnakePattern {
    static void main() {
        int[][] arr = {
                {4, 5, 6},
                {7, 1, 8},
                {9, 7, 3}
        };
        find(arr);
    }
    public static void find(int[][] arr){
        for(int i = 0; i< arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for (int j = arr[0].length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
