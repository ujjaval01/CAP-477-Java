package LeetCodeQuestions;
/*
441. Arranging Coins
Solved
Easy
Topics
premium lock icon
Companies
You have n coins and you want to build a staircase with these coins. The staircase consists of k
rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
*/
public class Q441ArrangingCoins {
    static void main() {
        int n = 13;
        int res = find(n);
        System.out.println(res);
    }
    static int find(int n){
        long low = 1, high = n;
        while(low<=high){
            long mid = (high + low) / 2;
            if(mid * mid == n) return (int)mid;
            else if (mid*mid > n) high = mid -1;
            else low = mid + 1;
        }
        return (int) high;
    }
    public int arrangeCoins(int n){
        return find((8*n + 1) - 1)/2;
    }
}
