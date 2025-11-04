package LeetCodeQuestions;

public class gfgSubsetSumProblem {
    static void main() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(arr, sum));
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        return helper(arr,0, 0);
    }

    static boolean helper(int[] arr, int sum, int idx) {
        if (sum == 0) return true;
        if (idx == arr.length) return false;

        if (arr[idx] > sum)
            return helper(arr, sum, idx + 1);

        boolean include = helper(arr, sum - arr[idx], idx + 1);
        boolean exclude = helper(arr, sum, idx + 1);

        return include || exclude;
    }
}
