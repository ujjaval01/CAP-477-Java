package LeetCodeQuestions;

public class SubsetSumProblem2nd {
    static void main() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(arr, sum)); // true
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                if (dp[j - arr[i]]) {
                    dp[j] = true;
                }
            }
        }
        return dp[sum];
    }

//    static Boolean isSubsetSum(int arr[], int sum) {
//        return helper(arr, sum, 0);
//    }
//
//    static boolean helper(int[] arr, int sum, int idx) {
//        // base case 1: अगर sum 0 हो गया तो subset मिल गया
//        if (sum == 0) return true;
//        // base case 2: array खत्म हो गया लेकिन sum नहीं मिला
//        if (idx == arr.length) return false;
//
//        // अगर current element sum से बड़ा है तो उसे skip करो
//        if (arr[idx] > sum)
//            return helper(arr, sum, idx + 1);
//
//        // दो options — include या exclude
//        boolean include = helper(arr, sum - arr[idx], idx + 1);
//        boolean exclude = helper(arr, sum, idx + 1);
//
//        return include || exclude;
//    }
}
