package LeetCodeQuestions;
/*Input: colors = "abaac", neededTime = [1,2,3,4,5]
Output: 3
Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
Bob can remove the blue balloon at index 2. This takes 3 seconds.
There are no longer two consecutive balloons of the same color. Total time = 3.

Input: colors = "aabaa", neededTime = [1,2,3,4,1]
Output: 2
Explanation: Bob will remove the balloons at indices 0 and 4. Each balloons takes 1 second to remove.
There are no longer two consecutive balloons of the same color. Total time = 1 + 1 = 2.*/
public class Q1578MinimumTimeToMakeRopeColorful {
    static void main() {
        String s = "abaac";
        int[] t = {1,2,3,4,5};
        System.out.println(minCost(s,t));
    }
    public static int minCost(String s, int[] t) {
        int n = s.length();
        int count = 0;

        for (int i = 1; i < n; i++) {
            char ch1 = s.charAt(i - 1);
            char ch2 = s.charAt(i);

            if (ch1 == ch2) {
                if (t[i - 1] <= t[i]) {
                    count += t[i - 1];
                } else {
                    count += t[i];
                    t[i] = t[i - 1];
                }
            }
        }

        return count;
    }
}
