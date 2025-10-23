package LeetCodeQuestions;

public class Q240SearchInAMatrix2nd {
    static void main() {
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int tar = 11;
        boolean ans = check(arr, tar);
        System.out.println(ans);
    }

    static boolean check(int[][] arr, int tar){
        int n = arr.length;
        int i = 0;
        int j = arr[0].length-1;
        while(j >= 0 && i < n){
            if(arr[i][j] == tar) return true;
            else if (arr[i][j] > tar) j--;
            else i++;
        }
        return false;
    }

}
