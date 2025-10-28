package Recursion;

public class LeastCommonMultiple {
    static void main() {
        int a = 18;
        int b = 12;
        int res = lcm(a,b);
        System.out.println(res);
    }


//     using brute force(Without gcd, less optimise) TC:- O(a × b)
    public static int lcm(int a, int b){
        int lcm = Math.max(a,b);
        while (true){
            if(lcm % a == 0 && lcm % b == 0) return lcm;
            lcm++;
        }
    }
}
