package Recursion;

// Greatest Common Factor...
public class HighestCommonFactor {
    static void main() {
        int a = 18;
        int b = 12;
        int res = hcf(a,b);
        System.out.println(res);



    }
    public static int hcf(int a, int b){
        if(a == 0) return b;
        return hcf(b%a, a);
    }
}
