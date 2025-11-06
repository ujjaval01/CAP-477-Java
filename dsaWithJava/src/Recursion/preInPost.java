package Recursion;

public class preInPost {
    static void main() {
        int n = 3;
        print(n);
    }
    public static void print(int n){
        if(n == 0) return;
        System.out.print("Pre " + n + " ");
        print(n-1);
        System.out.print("In " + n + " ");
        print(n-1);
        System.out.print("Post " + n+ " ");
    }
}
