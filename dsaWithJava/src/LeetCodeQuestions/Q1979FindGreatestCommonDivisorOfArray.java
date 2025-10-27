package LeetCodeQuestions;

public class Q1979FindGreatestCommonDivisorOfArray {
    static void main() {
        int[] arr = {16,17,18,19,8};
        int ans = findGCD(arr);
        System.out.println(ans);
    }
    public static int findGCD(int[] arr) {
        int min = Integer.MAX_VALUE; // 100||  3
        int max = Integer.MIN_VALUE; // 0  ||
        int res = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        for(int k = 0; k<arr.length; k++){
            if(arr[k] > max) max = arr[k];
        }

        for(int j = 1; j<=max; j++){
            if(min % j == 0 && max % j == 0) res = j;
        }
        return res;
    }
}
