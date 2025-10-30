package LeetCodeQuestions;

public class Q123BestTimeToBuyAndSellStockII {
    static void main() {
        int[] arr = {7,1,5,3,6,4};
        int res = maxProfit(arr);
        System.out.println(res);
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
