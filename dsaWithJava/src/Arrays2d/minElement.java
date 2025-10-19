package Arrays2d;
/*find the minimum element out of the all the maximum element of each row
  like exm-
           4  5   6     max 6
           7  1   8     max 8
           9  11  3     max 11
then finding min element out of the all the maximum element of each row 6, 8, 11 -> min-6
Output- 6
           */
public class minElement {
    static void main() {
        int[][] arr = {
                {4, 5, 6},
                {7, 1, 8},
                {9, 11, 3}
        };
        int res = find(arr);
        System.out.println(res);
    }
    static int find(int[][] arr){
        int max = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){

            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max < minValue){
                minValue = max;
            }
        }
        return minValue;
    }
}
