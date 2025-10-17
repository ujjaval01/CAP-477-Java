package Arrays2d;
/*Search an element X is present in the matrix or not, if present then
return the indices of that element, if not then return -1.
arr = {{4,5,6},{7,1,8},{9,2,3}}
input: x = 8
output: (1,2)
*/

public class Question {
    static void main() {
        int[][] arr = {{4,5,6},
                       {7,1,8},
                       {9,2,3}};
        int x = 8;
        String res = find(arr, x);
        System.out.println(res);
    }
    static String find(int[][] arr,int x){
        int row = arr.length;
        int cols = arr[0].length;
        for(int i =0; i<row; i++){
            for(int j = 0; j<cols; j++){
                if(arr[i][j] == x){
                    return "(" + i+ "," + j + ")";
                }
            }
        }
        return "-1";
    }
}
