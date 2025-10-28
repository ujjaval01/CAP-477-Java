package Recursion;

public class factorial {
    static void main() {
        int n = 5;
        int ans = find(n);
        System.out.println(ans);
    }
    static int find(int n){
        if(n == 0 || n == 1) return 1;
        return n * find(n-1);
//        return (n<=1) ? 1 : n*find(n-1);
    }
}
