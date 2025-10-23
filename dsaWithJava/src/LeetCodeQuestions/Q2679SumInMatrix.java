package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2679SumInMatrix {
    static void main() {
        int[][] arr = {
                {7,2,1}, {6,4,2}, {6,5,3}, {1,2,9}
                //(0,0)  (1,0) (2,0) (3,0)
                //(0,1)  (1,1) (2,1) (3,1)
                //(0,2)  (1,2) (2,2) (3,2)

        };

        int ans = matrixSum(arr);
        System.out.println(ans);
    }
    public static int matrixSum(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            Arrays.sort(arr[i]);
        }
        for(int i = 0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<m; j++)
                if(arr[j][i] > max) max = arr[j][i];
            sum += max;
        }
        return sum;
    }
}