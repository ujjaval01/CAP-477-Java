package Recursion;

public class gcdOfTwoNum {
    static void main() {
        int a = 28;
        int b = 20;
        int res = gcd(a,b);
        System.out.println(res);
    }
    public static int gcd(int a, int b) {
        // code here
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
