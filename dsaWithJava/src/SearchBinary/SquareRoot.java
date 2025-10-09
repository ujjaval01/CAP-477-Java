package SearchBinary;
/*Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number.
Examples:
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.
Input: n = 11
Output: 3
Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.
*/

public class SquareRoot {
    static void main() {
        int n = 16;
        int res = find(n);
        System.out.println(res);
    }
    static int find(int n){
        int root = 0;
        for(int i = 1; i<n; i++) {
            if (i * i > n) break;
            root = i;
        }
        return root;
    }

}
