package LeetCodeQuestions;

public class Q1071GreatestCommonDivisorOfStrings {
    static void main() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String res = gcdOfStrings(str1, str2);
        System.out.println(res);
    }
    public static String gcdOfStrings(String str1, String str2) {
        // Quick check: concatenation must match
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int len1 = str1.length();
        int len2 = str2.length();
        int g = gcd(len1, len2);
        return str1.substring(0, g);
    }

    // Euclidean algorithm for gcd
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
