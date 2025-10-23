package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q54SpiralMatrix {
    static void main() {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        List<Integer> res = spiralOrder(arr);
        System.out.println(res);

    }
    public static List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length; int n = arr[0].length;
        int firstRow = 0, lastRow = m-1;
        int firstCol = 0, lastCol = n-1;
        while(firstCol <= lastCol && firstRow <= lastRow){
            for(int j = firstCol; j<=lastCol; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;
            for(int i = firstRow; i<=lastRow; i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            for(int j = lastCol; j>=firstCol; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            for(int i =lastRow; i>=firstRow; i--){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }


        return ans;
    }
}
