package Arrays2d;

public class MaxElementIn2dArray {
    static void main() {
        int[][] arr = {{4, 5, 6}, {7, 1, 8}, {9, 11, 3}};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
