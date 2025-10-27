package LeetCodeQuestions;
/*
Ye ky bwasir h khud meri hi smanjh ni aaya
* */
public class Q1922CountGoodNumber {
    static void main() {
        long n = 4;
        int res = countGoodNumbers(n);
        System.out.println(res);

    }
    public static int countGoodNumbers(long n) {
        return (int) (modPow(4 * 5, n / 2) * (n % 2 == 0 ? 1 : 5) % MOD);
    }

    private static final int MOD = 1_000_000_007;

    public static long modPow(long x, long n) {
        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return x * modPow(x, n - 1) % MOD;
        return modPow(x * x % MOD, n / 2);
    }
}
