package LeetCodeQuestions;

import java.util.ArrayList;

public class MatrixMultiply {
    static void main() {
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2 = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };

//        if we want the output in Array
//        int[][] ans = multiply(arr1,arr2);
//        for(int i = 0; i<ans.length; i++){
//            for (int j = 0; j< ans.length; j++){
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }

//        if we want the output in ArrayList
        System.out.println(multiply(arr1,arr2));


    }
//    static int[][] multiply(int[][] a, int[][] b){
    static ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b){
        int n = a.length;
        int[][] c = new int[n][n];
        for(int i = 0; i<n; i++){
            for (int j = 0; j< n; j++){
                for(int k = 0; k<n; k++){
                   c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
//        return c;

       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j< n; j++) {
                ans.get(i).add(c[i][j]);
            }
        }
        return ans;
    }

}
