package Recursion;

public class LeastCommonMultiple {
    static void main() {
        int a = 18;
        int b = 12;
        int res = lcm(a,b);
        System.out.println(res);
    }
    //Using Gcd(Optimized) TC:- O(log(min(a, b)))
    public static int lcm(int a, int b){
        int gcd = gcd(a,b);
        System.out.println("gcd : " + gcd);
        //Formula:- (a * b) = [lcm(a,b) * hcf(a,b)]
        return (a*b)/gcd;
    }

    public static int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }



////     using brute force(Without gcd, less optimise) TC:- O(a × b)
//    public static int lcm(int a, int b){
//        int lcm = Math.max(a,b);
//        while (true){
//            if(lcm % a == 0 && lcm % b == 0) return lcm;
//            lcm++;
//        }
//    }
}
