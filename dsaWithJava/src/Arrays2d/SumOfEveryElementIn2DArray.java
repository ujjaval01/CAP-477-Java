package Arrays2d;

public class SumOfEveryElementIn2DArray {
    static void main() {
        int[][] arr = {{4,5,6}, {7,1,8}, {9,2,3}};
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
