package Recursion;
/*check the next fibonacci num....
0 1 1 2 3 5 8 13 21 34 55 89
for n = 8 -> n(8) + n(7) = 13 + 8 = 21
*/
public class NthFibonacciNumber {
    static void main() {
        int n = 8;
        System.out.print(fNum(n) + " ");
    }
    public static int fNum(int n){
        if(n == 0 || n == 1) return n;
        return fNum(n-1) + fNum(n-2);
    }
}
