package Recursion;

public class PrintNToOne {
    static void main() {
        int n = 9;
        print(n);
    }
    static void print(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        print(n-1);
    }
}
