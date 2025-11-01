package Recursion;
/*Given a number n, find the value of n raised to the power of its own reverse.
Note: The result will always fit into a 32-bit signed integer.
Examples:
Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10.
Constraints: 1 ≤ n ≤ 10
*/
public class PowerOfNumber {
    static void main() {

        int n = 5;
        int res = reverseExponentiation(n);
        System.out.println(res);
    }
    public static int reverseExponentiation(int n) {
        // code here
        int r = rev(n);
        return pow(n, r);
    }
    public static int rev(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n% 10;
            n/=10;
        }
        return rev;
    }
    public static int pow(int n, int p){
        if(p == 0) return 1;
        return n * pow(n, p - 1);
    }

}
