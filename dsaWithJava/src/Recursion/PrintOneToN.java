package Recursion;

public class PrintOneToN {
    static void main() {
        int n = 9;
        print(1, n);
    }
    static void print(int x, int n){
        if(x > n) return;
        System.out.print(x + " ");
        print(x+1, n);
    }
}
