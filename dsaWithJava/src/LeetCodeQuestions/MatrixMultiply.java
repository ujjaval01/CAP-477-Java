package LeetCodeQuestions;

public class MatrixMultiply {
    static void main() {
        int[][] arr1 = {
                {1,2},
                {3,4}
        };
        int[][] arr2 = {
                {4,3},
                {2,1}
        };

        int[][] ans = multiply(arr1,arr2);
        for(int i = 0; i<ans.length; i++){
            for (int j = 0; j< ans.length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] multiply(int[][] a, int[][] b){
        int n = a.length;
        int[][] c = new int[n][n];
        for(int i = 0; i<n; i++){
            for (int j = 0; j< n; j++){
                for(int k = 0; k<n; k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return c;
    }
}
