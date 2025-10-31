package LeetCodeQuestions;

public class WayToReachTheNthStair {
    static void main() {
        int n = 5;
        int res = stairs(n);
        System.out.println(res);
    }
    public static int stairs(int n){
        if(n <=2) return n;
        return stairs(n-1) + stairs(n-2);
    }
}
