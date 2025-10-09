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

    // using binary search algo
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





    // simple method...
//    static int find(int n){
//        int root = 0;
//        for(int i = 1; i<n; i++) {
//            if (i * i > n) break;
//            root = i;
//        }
//        return root;
//    }

}
