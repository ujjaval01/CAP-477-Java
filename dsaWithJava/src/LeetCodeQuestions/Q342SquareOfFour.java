package LeetCodeQuestions;

public class Q342SquareOfFour {
    public static void main(String[] args){
        int n = 64;
        boolean b = check(n);
        System.out.println(b);

    }
    static boolean check(int n) {
        if (n <= 0) return false;
        int i = 1;
        while (i < n) {
            i = i * 4;
        }
        return i == n;
    }
}
