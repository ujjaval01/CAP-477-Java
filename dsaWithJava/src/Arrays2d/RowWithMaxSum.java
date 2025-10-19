package Arrays2d;

public class RowWithMaxSum {
    static void main() {
        int[][] arr = {{4, 5, 6}, {7, 1, 8}, {9, 2, 1}};
        int maxSum = Integer.MIN_VALUE;
        int rowSum = 0;
        int row = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(j == 0){
                    rowSum = 0;
                }
                rowSum = rowSum + arr[i][j];
                if(maxSum < rowSum){
                    maxSum = rowSum;
                    row = i;
                }
            }
        }
        System.out.println(maxSum + " is the maxSum, Present in the row " + row);

    }
}
