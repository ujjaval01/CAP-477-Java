package Arrays2d;

public class RowWithMaxSum {
    static void main() {
        int[][] arr = {
                {100, -90, -90},  // total sum = -80
                {5, 5, 5}         // total sum = 15
        };
        int maxSum = Integer.MIN_VALUE;
        int row = -1;

        for(int i = 0; i< arr.length; i++){
            int rowSum = 0;
            for(int j = 0; j<arr[0].length; j++){
                rowSum = rowSum + arr[i][j];
            }
            if(maxSum < rowSum){
                maxSum = rowSum;
                row = i;
            }
        }
        System.out.println(maxSum + " is the maxSum, Present in the row " + row);

    }
}
