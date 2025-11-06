package Recursion;

public class TowerOfHanoi {
    static void main() {
        int n = 3;
        hanoi(n, 'A','B','C');
    }
    public static void hanoi(int n, char s, char h, char d){
        if(n == 0) return;   // return when n is equals to zero
        hanoi(n-1, s, d, h);  // n-1 disks from A to C via B
        System.out.println(s + " -> " +d);  // largest from A to C
        hanoi(n-1,h,d ,s); // n-1 disk from B to C via A
    }
}
